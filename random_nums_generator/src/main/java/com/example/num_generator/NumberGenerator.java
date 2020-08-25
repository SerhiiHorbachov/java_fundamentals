package com.example.num_generator;

public class NumberGenerator {

    /**
     * @param size number of values to be generated
     * @return int []
     */
    public int[] generateInts(final int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        return numbers;
    }

}
