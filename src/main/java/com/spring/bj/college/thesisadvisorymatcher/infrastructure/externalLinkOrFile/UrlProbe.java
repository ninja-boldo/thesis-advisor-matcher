package com.spring.bj.college.thesisadvisorymatcher.infrastructure.externalLinkOrFile;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class UrlProbe implements ExternalProbe {

    private final HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(3))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();

    @Override
    public boolean supports(URI uri) {
        return "http".equals(uri.getScheme())
                || "https".equals(uri.getScheme());
    }

    @Override
    public boolean exists(URI uri) {
        try {
            HttpRequest request = HttpRequest.newBuilder(uri)
                    .timeout(Duration.ofSeconds(3))
                    .method("HEAD", HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<Void> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.discarding()
            );

            return response.statusCode() < 400;

        } catch (Exception e) {
            return false;
        }
    }
}