package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.AdvisorRepository;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.StudentRepository;

public class DeleteStudent {
    private final StudentRepository repository;
    public DeleteStudent(StudentRepository repository){
        this.repository = repository;
    }
    public void deleteById(StudentID studentID){
        this.repository.deleteById(studentID);
    }
}
