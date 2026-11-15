package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.StudentRepository;

public class RegisterStudent {
    private final StudentRepository repository;

    public RegisterStudent(StudentRepository repository){
        this.repository = repository;
    }

    public Student register(Student student) {
        return this.repository.saveStudent(student);
    }
}
