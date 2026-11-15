package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;
import java.util.List;
import java.util.Optional;

public interface AdvisorRepository {
    Optional<Advisor> findByMail(EmailAddress emailAddress);
    List<Advisor> findAll();
    Advisor saveAdvisor(Advisor advisor);
    void deleteByMail(EmailAddress emailAddress);
}
