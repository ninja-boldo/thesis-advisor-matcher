package com.spring.bj.college.thesisadvisorymatcher.domain.util;

import java.util.concurrent.ThreadLocalRandom;

public final class RandomStringGenerator {

    private RandomStringGenerator() {}

    public static String randomLetters(int length) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            char letter = (char) ThreadLocalRandom.current()
                    .nextInt('A', 'Z' + 1);

            result.append(letter);
        }

        return result.toString();
    }

    public static String randomNumbers(int length) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(ThreadLocalRandom.current().nextInt(10));
        }

        return result.toString();
    }
}