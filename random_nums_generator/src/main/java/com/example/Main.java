package com.example;

import com.example.num_generator.NumberGenerator;
import com.example.view.DisplayManager;

//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Main {
    public static void main(String[] args) {

        NumberGenerator generator = new NumberGenerator();
        DisplayManager display = new DisplayManager();

        display.displayNumbersInRow(generator.generateInts(8));
        display.displayNumbersInNewLines(generator.generateInts(10));

    }
}
