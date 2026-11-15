package com.spring.bj.college.thesisadvisorymatcher.domain.util;

import com.spring.bj.college.thesisadvisorymatcher.domain.model.student.StudentID;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandUtils {
    public RandUtils(){}
    public StudentID generateRandomStudentId(){
        String firstLetterSeq = randomLetters(3);
        String numInsert = randomNumbers(3);
        String secondLetterSeq = randomLetters(4);

        String rawId = firstLetterSeq + numInsert + secondLetterSeq;
        return new StudentID(rawId);
    }

    private static String randomLetters(int length) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(randomLetter());
        }

        return result.toString();
    }

    private static String randomNumbers(int length) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(randomNumber());
        }

        return result.toString();
    }

    private static String randomNumber() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(0, 10));
    }

    private static String randomLetter() {
        char letter = (char) ThreadLocalRandom.current().nextInt('A', 'Z' + 1);
        return String.valueOf(letter);
    }
}
