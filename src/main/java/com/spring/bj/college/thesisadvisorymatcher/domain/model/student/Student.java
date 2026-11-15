package com.spring.bj.college.thesisadvisorymatcher.domain.model.student;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;

public record Student(String name, Faculty faculty, StudentID id, EmailAddress emailAddress){}