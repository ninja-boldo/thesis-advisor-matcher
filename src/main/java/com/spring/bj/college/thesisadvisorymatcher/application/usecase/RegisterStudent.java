package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Faculty;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.StudentRepository;

public class RegisterStudent {
    private final StudentRepository repository;

    public RegisterStudent(StudentRepository repository){
        this.repository = repository;
    }

    public Student register(String name, Faculty faculty, EmailAddress mail) {
        return this.repository.saveStudent(name, faculty, mail);
    }
}
