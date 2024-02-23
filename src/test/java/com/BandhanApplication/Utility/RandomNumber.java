package com.BandhanApplication.Utility;

import java.util.Random;

public class RandomNumber {

    public static String randomNumber()
    {
        Random random = new Random();

        // Generate a random digit between 6 and 9 for the first digit
        int firstDigit = random.nextInt(4) + 6;

        // Generate the remaining 9 digits
        StringBuilder remainingDigits = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            remainingDigits.append(random.nextInt(10));
        }

        // Concatenate the first digit and remaining digits to form the complete mobile number
        return String.valueOf(firstDigit) + remainingDigits.toString();
    }

}
