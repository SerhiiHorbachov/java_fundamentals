package com.calendar.controller;

import com.calendar.exception.UserInputValidationException;
import com.calendar.repository.Months;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class MonthController {

    private final static String NOT_IN_RANGE_ERROR_MSG_TEMPLATE = "Make sure number is in range: %d - %d";

    Months monthsRepository;

    public MonthController() {
        monthsRepository = new Months();
    }

    public void getMonthByNumber() {
        int userInput = getMonthNumberFromUser();
        System.out.println(monthsRepository.getMonthName(userInput));
    }

    public int getMonthNumberFromUser() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        String userInputStr = null;
        try {
            while (true) {

                System.out.println("Enter integer in range 1-12");
                userInputStr = bufferedReader.readLine();

                try {
                    isInputValidMonthNumber(userInputStr);
                    break;
                } catch (UserInputValidationException e) {
                    System.out.println(e.getMessage());
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(userInputStr);

    }

    private void isInputValidMonthNumber(String input) throws UserInputValidationException {
        int minRangeValue = Collections.min(monthsRepository.getKeys());
        int maxRangeValue = Collections.max(monthsRepository.getKeys());
        int monthNum;

        try {
            monthNum = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new UserInputValidationException(e.getMessage());
        }

        if (monthNum < minRangeValue || monthNum > maxRangeValue) {
            throw new UserInputValidationException(String.format(NOT_IN_RANGE_ERROR_MSG_TEMPLATE, minRangeValue, maxRangeValue));
        }
    }

}
