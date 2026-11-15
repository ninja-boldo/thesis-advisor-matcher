package com.spring.bj.college.thesisadvisorymatcher.domain.model.matching;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;

public record AdvisorMatchResult(Advisor advisor, MatchScore score) {
}
