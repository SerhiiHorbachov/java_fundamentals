package com.example.service;

public class StringOperator {

    public String[] reverseArr(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }
}
