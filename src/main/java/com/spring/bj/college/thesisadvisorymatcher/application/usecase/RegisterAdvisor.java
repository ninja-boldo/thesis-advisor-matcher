package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.repository.AdvisorRepository;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;

public class RegisterAdvisor {
    private final AdvisorRepository repository;

    public RegisterAdvisor(AdvisorRepository repository){
        this.repository = repository;
    }

    public Advisor register(Advisor advisor) {
        return this.repository.saveAdvisor(advisor);
    }
}
