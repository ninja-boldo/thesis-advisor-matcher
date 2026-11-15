package com.spring.bj.college.thesisadvisorymatcher.domain.model.acceptedThesis;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;

import java.util.Optional;

public record AcceptedThesis (StudentID studentId, EmailAddress advisorMailAddress, String title, Optional<String> description){}
