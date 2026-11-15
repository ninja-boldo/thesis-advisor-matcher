package com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor;

import java.util.Collections;
import java.util.Set;
import lombok.Getter;

public class Advisor {
  @Getter private final String name;
  private final Set<Interest> interests;
  @Getter private final ContactInfo contact;

  public Advisor(String name, Set<Interest> interestSet, ContactInfo contact) {
    this.name = name;
    this.interests = interestSet;
    this.contact = contact;
  }

  public void addInterest(Interest interest) {
    this.interests.add(interest);
  }

  public Set<Interest> getInterests() {
    return Collections.unmodifiableSet(this.interests);
  }
}
