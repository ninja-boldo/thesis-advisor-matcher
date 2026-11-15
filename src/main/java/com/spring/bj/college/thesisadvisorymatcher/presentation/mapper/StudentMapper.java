package com.spring.bj.college.thesisadvisorymatcher.presentation.mapper;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.presentation.dto.response.StudentResponse;

public class StudentMapper {
    private StudentMapper() {}

    public static StudentResponse toResponse(Student student) {
        return new StudentResponse(
                student.id().rawId(),
                student.name(),
                student.faculty().name(),
                student.emailAddress().value()
        );
    }
}

