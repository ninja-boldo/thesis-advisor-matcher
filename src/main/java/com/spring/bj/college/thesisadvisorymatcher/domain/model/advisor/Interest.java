package com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.Faculty;

import java.util.Optional;
import java.util.Set;

public record Interest(String name, Optional<Set<Faculty>> associatedFaculties) {}
