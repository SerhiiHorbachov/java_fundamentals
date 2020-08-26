package com.greeting;

import com.greeting.service.InputReader;

public class Main {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        
        System.out.println("Type your name:");
        String name = inputReader.readConsoleInput();
        System.out.println("Hello, " + name);

    }
}
