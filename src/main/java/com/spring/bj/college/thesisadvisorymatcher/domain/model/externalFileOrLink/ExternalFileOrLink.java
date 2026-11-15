package com.spring.bj.college.thesisadvisorymatcher.domain.model.externalFileOrLink;

import java.net.URI;
import java.time.LocalDateTime;

public record ExternalFileOrLink(URI uri) {

    public ExternalFileOrLink(String value, String nameUploadPerson, LocalDateTime ts) {
        this(URI.create(value));
    }
}