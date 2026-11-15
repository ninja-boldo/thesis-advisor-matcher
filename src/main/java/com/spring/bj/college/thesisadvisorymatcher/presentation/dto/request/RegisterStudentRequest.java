package com.spring.bj.college.thesisadvisorymatcher.presentation.dto.request;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Faculty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterStudentRequest(
        @NotBlank String name,
        @NotNull Faculty faculty,
        @Email String emailAddress
) {}
