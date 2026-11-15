package com.spring.bj.college.thesisadvisorymatcher.application.usecase;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor.Advisor;
import com.spring.bj.college.thesisadvisorymatcher.domain.repository.AdvisorRepository;

public class DeleteAdvisor {
    private final AdvisorRepository repository;

    public DeleteAdvisor(AdvisorRepository repository){
        this.repository = repository;
    }
    public void deleteByMail(EmailAddress emailAddress){
        this.repository.deleteByMail(emailAddress);
    }
}
