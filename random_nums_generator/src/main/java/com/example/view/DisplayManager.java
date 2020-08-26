package com.example.view;

public class DisplayManager {
    private final static String DELIMETER = " ";

    public void displayNumbersInRow(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + DELIMETER);
        }
        System.out.print("\n");
    }

    public void displayNumbersInNewLines(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
