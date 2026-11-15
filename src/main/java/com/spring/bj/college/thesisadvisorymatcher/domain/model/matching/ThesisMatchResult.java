package com.spring.bj.college.thesisadvisorymatcher.domain.model.matching;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.thesis.Thesis;

public record ThesisMatchResult (Thesis thesis, MatchScore score){
}
