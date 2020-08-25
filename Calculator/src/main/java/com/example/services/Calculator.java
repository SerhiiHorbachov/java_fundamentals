package com.example.services;

public class Calculator {
    
    /**
     * The method sums elements of the array.
     *
     * @param numbers - array of longs.
     * @return long
     */
    public long sum(long[] numbers) {
        long sum = 0;

        for (long number : numbers) {
            sum += number;
        }

        return sum;
    }
}
