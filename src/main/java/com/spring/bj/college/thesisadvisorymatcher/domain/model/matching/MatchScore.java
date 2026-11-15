package com.spring.bj.college.thesisadvisorymatcher.domain.model.matching;

public record MatchScore(double value) {

    public MatchScore {
        if (!Double.isFinite(value) || value < 0.0 || value > 1.0) {
            throw new IllegalArgumentException(
                    "Match score must be between 0.0 and 1.0"
            );
        }
    }
}
