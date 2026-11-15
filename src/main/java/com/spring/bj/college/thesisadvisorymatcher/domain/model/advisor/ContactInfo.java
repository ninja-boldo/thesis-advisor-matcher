package com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor;

import java.util.Optional;

public record ContactInfo(String email, String address, Optional<String> mobileNumber) {}
