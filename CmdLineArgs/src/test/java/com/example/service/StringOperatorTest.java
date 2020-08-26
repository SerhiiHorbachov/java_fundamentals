package com.example.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringOperatorTest {

    private StringOperator stringOperator;
    private String[] initialArray;
    private String[] expectedReversedArray;

    @BeforeAll
    void setUp() {
        stringOperator = new StringOperator();

        initialArray = new String[]{"First", "Second", "Third", "Fourth"};
        expectedReversedArray = new String[]{"Fourth", "Third", "Second", "First"};
    }

    @Test
    void smokeTest() {
        assertTrue(true);
    }

    @Test
    void reverseArr_ShouldReturnReversedArrayOfStrings() {
        String[] actual = stringOperator.reverseArr(initialArray);

        assertArrayEquals(expectedReversedArray, actual);
    }
}