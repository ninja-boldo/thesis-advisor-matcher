package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.AdvisorRepository;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class FindStudent {
    private final StudentRepository repository;

    public FindStudent(StudentRepository repository){
        this.repository = repository;
    }

    public Optional<Student> findByMail(StudentID studentID) {
        return this.repository.findById(studentID);
    }

    public List<Student> findAll() {
        return this.repository.findAll();
    }
}
