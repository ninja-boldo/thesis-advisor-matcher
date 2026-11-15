package com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.UserID;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public record Advisor(
        UserID id,
        String name,
        Set<Interest> interests,
        ContactInfo contact
) {
  public Advisor {
    interests = new HashSet<>(interests);
  }

  public void addInterest(Interest interest) {
    interests.add(interest);
  }

  @Override
  public Set<Interest> interests() {
    return Collections.unmodifiableSet(interests);
  }
}