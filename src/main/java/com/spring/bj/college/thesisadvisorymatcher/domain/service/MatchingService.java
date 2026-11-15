package com.spring.bj.college.thesisadvisorymatcher.domain.service;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Interest;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.matching.AdvisorMatchResult;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.matching.MatchScore;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.matching.ThesisMatchResult;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.thesis.Thesis;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class MatchingService {

    public static List<ThesisMatchResult> matchStudentToThesis(
            Student student,
            List<Thesis> availableThesis,
            Set<Interest> currentStudentInterests,
            int topK
    ) {
        return availableThesis.stream()
                .map(thesis -> new ThesisMatchResult(
                        thesis,
                        getMatchScoreThesis(student, thesis, currentStudentInterests)
                ))
                .sorted(Comparator.comparing(
                        ThesisMatchResult::score,
                        Comparator.comparingDouble(MatchScore::value).reversed()
                ))
                .limit(topK)
                .toList();
    }

    public static List<AdvisorMatchResult> matchStudentToAdvisor(
            Student student,
            List<Advisor> availableAdvisors,
            Set<Interest> currentStudentInterests,
            int topK
    ) {
        return availableAdvisors.stream()
                .map(advisor -> new AdvisorMatchResult(
                        advisor,
                        getMatchScoreAdvisor(student, advisor, currentStudentInterests)
                ))
                .sorted(Comparator.comparing(
                        AdvisorMatchResult::score,
                        Comparator.comparingDouble(MatchScore::value).reversed()
                ))
                .limit(topK)
                .toList();
    }

    private static MatchScore getMatchScoreThesis(Student student, Thesis thesis, Set<Interest> currentStudentInterests){
        boolean passedNecessaryModules = student.passedModules().containsAll(thesis.requiredModules());
        double tagOverlap = getTagOverlap(currentStudentInterests, thesis.tags());
        if(!passedNecessaryModules) return new MatchScore(0);
        return new MatchScore(tagOverlap);
    }

    private static MatchScore getMatchScoreAdvisor(Student student, Advisor advisor, Set<Interest> currentStudentInterests){
        double tagOverlap = getTagOverlap(currentStudentInterests, advisor.interests());
        return new MatchScore(tagOverlap);
    }

    private static double getTagOverlap(Set<Interest> mainTagSet, Set<Interest> changingTagSet){
        long hits = mainTagSet.stream().filter(changingTagSet::contains).count();
        return (double) hits / mainTagSet.size();
    }
}
