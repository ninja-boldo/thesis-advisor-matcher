package com.spring.bj.college.thesisadvisorymatcher.domain.model.proposedThesis;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;

import java.util.Optional;

public record ProposedThesis (StudentID studentId, Optional<EmailAddress> targetedAdvisorMailAddress, String title, Optional<String> description){}
