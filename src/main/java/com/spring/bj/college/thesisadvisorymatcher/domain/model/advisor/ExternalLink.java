package com.spring.bj.college.thesisadvisorymatcher.domain.model.advisor;

import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.Getter;

public class ExternalLink {

  @Getter private final URI uri;

  public ExternalLink(URI uri) {
    if (!isValidURI(uri)) {
      throw new IllegalArgumentException("Invalid URI: " + uri);
    }
    this.uri = uri;
  }

  private boolean isValidURI(URI uri) {
    return uri != null
        && uri.isAbsolute()
        && switch (uri.getScheme().toLowerCase()) {
          case "http", "https" -> uri.getHost() != null;
          case "file" -> true;
          default -> false;
        };
  }

  public boolean exists() {
    if ("file".equals(uri.getScheme())) {
      return Files.isRegularFile(Path.of(uri));
    }

    return webLinkExists(uri);
  }

  private boolean webLinkExists(URI link) {
    try {
      HttpURLConnection connection = (HttpURLConnection) link.toURL().openConnection();

      connection.setRequestMethod("HEAD");
      connection.setConnectTimeout(3000);
      connection.setReadTimeout(3000);

      int responseCode = connection.getResponseCode();
      connection.disconnect();

      return responseCode >= 200 && responseCode < 400;

    } catch (Exception e) {
      return false;
    }
  }
}
