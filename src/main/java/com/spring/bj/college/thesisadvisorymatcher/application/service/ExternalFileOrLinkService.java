package com.spring.bj.college.thesisadvisorymatcher.application.service;


import com.spring.bj.college.thesisadvisorymatcher.application.port.ExternalProbe;
import com.spring.bj.college.thesisadvisorymatcher.domain.model.externalFileOrLink.ExternalFileOrLink;

import java.util.List;

public class ExternalFileOrLinkService {

    private final List<ExternalProbe> probes;

    public ExternalFileOrLinkService(List<ExternalProbe> probes) {
        this.probes = probes;
    }

    public boolean exists(ExternalFileOrLink external) {
        return probes.stream()
                .filter(probe -> probe.supports(external.uri()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "Unsupported URI: " + external.uri()
                ))
                .exists(external.uri());
    }
}