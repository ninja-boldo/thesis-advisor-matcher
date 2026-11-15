package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Faculty;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
        Optional<Student> findById(UserID studentID);
        List<Student> findAll();
        Student saveStudent(String name, Faculty faculty, EmailAddress mail);
        void deleteById(UserID studentID);
}
