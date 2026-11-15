package com.spring.bj.college.thesisadvisorymatcher.domain.model;

public record EmailAddress(String value) {
    public EmailAddress{
        if(value == null || value.length() < 8 || !value.contains("@")){
            throw new IllegalArgumentException("the provided mail doesnt seem to be valid: " + value);
        }
    }
}
