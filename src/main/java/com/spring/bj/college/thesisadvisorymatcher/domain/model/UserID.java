package com.spring.bj.college.thesisadvisorymatcher.domain.model;

public record UserID(String rawId) {
    public UserID {
        if (rawId == null || !this.isValidId(rawId)) {
            throw new IllegalArgumentException("Invalid User ID: " + rawId);
        }
    }
    private boolean isValidId(String id){
        return id.length() < 12 && id.length() > 6; // later on actual requirements can be enforced(i dont know about hhu ones)
    }
}