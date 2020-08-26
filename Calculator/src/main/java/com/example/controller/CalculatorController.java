package com.example.controller;

import com.example.services.Calculator;
import com.example.services.Converter;

public class CalculatorController {

    Converter converter;
    Calculator calculator;

    public CalculatorController() {
        this.converter = new Converter();
        this.calculator = new Calculator();
    }

    public void sum(String[] args) {
        long[] userArgs = new long[0];
        try {
            userArgs = converter.convertCommandArgsToArrayOfLong(args);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + ". Make sure your input is an integer number. Exiting the program");
            System.exit(1);
        }
        System.out.println("Sum: " + calculator.sum(userArgs));
    }
}
