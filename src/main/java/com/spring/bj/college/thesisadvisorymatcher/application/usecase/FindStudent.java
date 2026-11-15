package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class FindStudent {
    private final StudentRepository repository;

    public FindStudent(StudentRepository repository){
        this.repository = repository;
    }

    public Optional<Student> findByMail(UserID id) {
        return this.repository.findById(id);
    }

    public List<Student> findAll() {
        return this.repository.findAll();
    }
}
