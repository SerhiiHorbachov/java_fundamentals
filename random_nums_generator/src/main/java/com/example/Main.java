package com.example;

import com.example.num_generator.NumberGenerator;
import com.example.view.DisplayManager;

public class Main {
    public static void main(String[] args) {

        NumberGenerator generator = new NumberGenerator();
        DisplayManager display = new DisplayManager();

        int[] generatedNumbers = generator.generateInts(8);

        display.displayNumbersInRow(generatedNumbers);
        display.displayNumbersInNewLines(generatedNumbers);

    }
}
