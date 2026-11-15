package com.spring.bj.college.thesisadvisorymatcher.domain.model.student;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.collegeModules.CollegeModule;

import java.util.Set;

public record Student(String name, Faculty faculty, UserID id, EmailAddress emailAddress, Set<CollegeModule> passedModules){}