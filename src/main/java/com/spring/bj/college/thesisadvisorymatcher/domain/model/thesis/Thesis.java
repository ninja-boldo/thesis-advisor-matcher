package com.spring.bj.college.thesisadvisorymatcher.domain.model.thesis;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.ThesisID;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;
import org.apache.catalina.User;

import java.util.Optional;

// a set advisor id means that it got accepted by this advisor
public record Thesis (UserID studentId, Optional<UserID> advisorID, ThesisID thesisID, String title, Optional<String> description){}
