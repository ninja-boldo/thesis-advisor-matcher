package com.spring.bj.college.thesisadvisorymatcher.domain.model.thesis;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.ThesisID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.collegeModules.CollegeModule;
import org.apache.catalina.User;

import java.util.Optional;
import java.util.Set;

// a set advisor and student id means that it got accepted and chosen
public record Thesis(ThesisID thesisID, String title, Set<CollegeModule> requiredModules, Optional<UserID> studentId, Optional<UserID> advisorID, Optional<String> description){}
