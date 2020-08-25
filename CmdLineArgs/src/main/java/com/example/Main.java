package com.example;

import com.example.service.StringOperator;
import com.example.view.DisplayManager;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            StringOperator stringOperator = new StringOperator();
            DisplayManager displayManager = new DisplayManager();

            displayManager.printArray(stringOperator.reverseArr(args));

        } else {
            System.out.println("No args passed. Exiting the program, bye!");
            System.exit(0);
        }
    }
}
