package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
        Optional<Student> findById(UserID studentID);
        List<Student> findAll();
        Student saveStudent(Student student);
        void deleteById(UserID studentID);
}
