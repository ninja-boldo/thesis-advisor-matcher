package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;

import java.util.List;
import java.util.Optional;

public interface AdvisorRepository {
    Optional<Advisor> findById(UserID advisorID);
    List<Advisor> findAll();
    Advisor saveAdvisor(Advisor advisor);
    void deleteById(UserID advisorID);
}
