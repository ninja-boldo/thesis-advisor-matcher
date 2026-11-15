package com.spring.bj.college.thesisadvisorymatcher.application.port;

import java.net.URI;

public interface ExternalProbe {

    boolean supports(URI uri);

    boolean exists(URI uri);
}