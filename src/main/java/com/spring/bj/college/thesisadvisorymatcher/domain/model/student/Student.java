package com.spring.bj.college.thesisadvisorymatcher.domain.model.student;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.EmailAddress;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.collegeModules.CollegeModule;

import java.util.Set;

public record Student(
        String name,
        Faculty faculty,
        UserID id,
        EmailAddress emailAddress,
        Set<CollegeModule> passedModules
) {
    // Explicit ID and modules
    public Student {
        passedModules = Set.copyOf(passedModules);
    }

    // Automatically generate ID
    public Student(
            String name,
            Faculty faculty,
            EmailAddress emailAddress,
            Set<CollegeModule> passedModules
    ) {
        this(name, faculty, UserID.generate(), emailAddress, passedModules);
    }

    // Automatically generate ID and empty modules
    public Student(
            String name,
            Faculty faculty,
            EmailAddress emailAddress
    ) {
        this(name, faculty, UserID.generate(), emailAddress, Set.of());
    }
}