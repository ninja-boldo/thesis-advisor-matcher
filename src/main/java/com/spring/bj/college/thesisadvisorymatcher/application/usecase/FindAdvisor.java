package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.AdvisorRepository;

import java.util.List;
import java.util.Optional;

public class FindAdvisor {
    private final AdvisorRepository repository;

    public FindAdvisor(AdvisorRepository repository){
        this.repository = repository;
    }

    public Optional<Advisor> findByMail(EmailAddress emailAddress) {
        return this.repository.findByMail(emailAddress);
    }

    public List<Advisor> findAll() {
        return this.repository.findAll();
    }
}
