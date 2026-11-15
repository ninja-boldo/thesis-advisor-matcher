package com.spring.bj.college.thesisadvisorymatcher.domain.model.externalFileOrLink;

import java.net.URI;

public record ExternalFileOrLink(URI uri) {

    public ExternalFileOrLink(String value) {
        this(URI.create(value));
    }
}