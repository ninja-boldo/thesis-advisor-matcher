package com.spring.bj.college.thesisadvisorymatcher.domain.repository;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.ThesisID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.thesis.Thesis;

import java.util.List;
import java.util.Optional;

public interface ThesisRepository {
    Optional<Thesis> findById(ThesisID thesisID);
    List<Thesis> findAll();
    Thesis saveThesis(Thesis thesis);
    void delete(Thesis thesis);
}
