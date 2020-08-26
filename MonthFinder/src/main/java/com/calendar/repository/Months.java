package com.calendar.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Months {

    private static final String ERROR_MSG_TEMPLATE = "Month %d is doesn't exist. Choose number in range: 1-12.";

    /**
     * Class variable months is a map.
     * Key - Integer, number of month, Value - String, Month's name.
     */
    private Map<Integer, String> months;

    {
        months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
    }

    /**
     * @param monthNumber - Integer, month's number.
     * @return String, correspondent month's name.
     * @throws IllegalArgumentException - when the map doesn't contain requested key.
     */
    public String getMonthName(int monthNumber) {

        if (months.containsKey(monthNumber) == true) {
            return months.get(monthNumber);
        } else {
            throw new IllegalArgumentException(String.format(ERROR_MSG_TEMPLATE, monthNumber));
        }

    }

    /**
     * Returns a map that contains numbers of months as keys and names of months as values.
     *
     * @return Map<Integer, String>.
     */
    public Map<Integer, String> getMonths() {
        return months;
    }

    /**
     * Returns Set of the months repository keys.
     *
     * @return Set<Integer>.
     */
    public Set<Integer> getKeys() {
        return months.keySet();
    }
}
