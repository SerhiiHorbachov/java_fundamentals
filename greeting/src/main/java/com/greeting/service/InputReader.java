package com.greeting.service;

import com.greeting.exceptions.InvalidNameException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class InputReader {

    private static final String NAME_PATTERN = "(^[A-Za-z]{%d,%d}$)";
    private static final String NAME_VALIDATION_FAIL_MSG;
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 15;

    static {
        NAME_VALIDATION_FAIL_MSG = String.format("Name should consist of letters only. Min %d, Max %d characters.", MIN_LENGTH, MAX_LENGTH);
    }

    public String readConsoleInput() {
        String userInput = null;
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;

        try {
            isr = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(isr);

            boolean isNameValid = false;

            while (!isNameValid) {
                try {
                    userInput = bufferedReader.readLine();
                    validateName(userInput.trim());
                    isNameValid = true;
                } catch (InvalidNameException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return userInput;
    }

    private void validateName(final String name) throws InvalidNameException {
        Pattern pattern = Pattern.compile(String.format(NAME_PATTERN, MIN_LENGTH, MAX_LENGTH));
        if (!pattern.matcher(name).matches()
            || name.isEmpty()
            || name.isBlank()
        ) {
            throw new InvalidNameException(NAME_VALIDATION_FAIL_MSG);
        }
    }

}
