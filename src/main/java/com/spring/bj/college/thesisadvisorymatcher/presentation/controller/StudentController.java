package com.spring.bj.college.thesisadvisorymatcher.presentation.controller;

import com.spring.bj.college.thesisadvisorymatcher.application.usecase.RegisterStudent;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.presentation.dto.request.RegisterStudentRequest;
import com.spring.bj.college.thesisadvisorymatcher.presentation.dto.response.StudentResponse;
import com.spring.bj.college.thesisadvisorymatcher.presentation.mapper.StudentMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final RegisterStudent registerStudent;

    public StudentController(RegisterStudent registerStudent) {
        this.registerStudent = registerStudent;
    }

    @PostMapping("/register")
    public ResponseEntity<StudentResponse> register(
            @Valid @RequestBody RegisterStudentRequest request
    ) {
        Student student = registerStudent.register(
                request.name(),
                request.faculty(),
                new EmailAddress(request.emailAddress())
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(StudentMapper.toResponse(student));
    }
}