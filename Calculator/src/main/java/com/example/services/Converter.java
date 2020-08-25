package com.example.services;

public class Converter {

    /**
     * Method converts array of String to the array of correspondent longs.
     *
     * @param args - String [].
     * @return long[] - each element of the array corresponds String value of the input array.
     * @throws NumberFormatException in case element of the array cannot be parsed to long.
     */

    public long[] convertCommandArgsToArrayOfLong(String[] args) throws NumberFormatException {

        long[] resultNumbers;

        if (args.length == 0) {
            return new long[0];
        } else {
            resultNumbers = new long[args.length];
        }

        for (int i = 0; i < args.length; i++) {
            resultNumbers[i] = Long.parseLong(args[i]);
        }

        return resultNumbers;
    }

}
