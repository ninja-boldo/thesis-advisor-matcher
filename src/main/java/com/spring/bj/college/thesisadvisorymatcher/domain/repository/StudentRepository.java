package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Student;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
        Optional<Student> findById(StudentID studentID);
        List<Student> findAll();
        Student saveStudent(Student student);
        void deleteById(StudentID studentID);
}
