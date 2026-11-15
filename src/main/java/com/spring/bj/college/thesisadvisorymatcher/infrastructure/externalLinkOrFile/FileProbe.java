package com.spring.bj.college.thesisadvisorymatcher.infrastructure.externalLinkOrFile;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProbe implements ExternalProbe {

    @Override
    public boolean supports(URI uri) {
        return "file".equals(uri.getScheme());
    }

    @Override
    public boolean exists(URI uri) {
        return Files.exists(Path.of(uri));
    }
}
