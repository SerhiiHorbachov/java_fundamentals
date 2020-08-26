package com.calendar.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MonthsTest {

    private Months monthsRepo;
    private Map<Integer, String> expectedMonthsRepo;

    @BeforeAll
    void setUp() {
        monthsRepo = new Months();

        expectedMonthsRepo = new HashMap<>();

        expectedMonthsRepo.put(1, "January");
        expectedMonthsRepo.put(2, "February");
        expectedMonthsRepo.put(3, "March");
        expectedMonthsRepo.put(4, "April");
        expectedMonthsRepo.put(5, "May");
        expectedMonthsRepo.put(6, "June");
        expectedMonthsRepo.put(7, "July");
        expectedMonthsRepo.put(8, "August");
        expectedMonthsRepo.put(9, "September");
        expectedMonthsRepo.put(10, "October");
        expectedMonthsRepo.put(11, "November");
        expectedMonthsRepo.put(12, "December");
    }

    @Test
    void smokeTest() {
        assertTrue(true);
    }

    @Test
    void getMonthName_ShouldReturnJanuary_WhenPassedParameterEqualsOne() {
        //Given
        int monthNumber = 1;
        String expected = "January";

        //When
        String actual = monthsRepo.getMonthName(monthNumber);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void getMonthName_ShouldThrowIllegalArgumentException_WhenMonthSRepositoryDoesntContainRequestedKey() {
        int monthNumber = 0;

        assertThrows(IllegalArgumentException.class, () -> monthsRepo.getMonthName(monthNumber));
    }

    @Test
    void getMonths_ShouldReturnMapOfTwelvePairsNumberOfMonthAndItsName() {
        Map<Integer, String> actual = monthsRepo.getMonths();
        assertTrue(expectedMonthsRepo.equals(actual));
    }

}