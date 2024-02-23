package com.BandhanApplication.Utility;

import java.net.StandardSocketOptions;
import java.util.Random;

public class RandomEmail {

    public static String generateRandomEmail() {
        // Define the domain name for the email
        String domain = "gmail.com";
        Random random = new Random();

        // Generate a random username part with a combination of letters and numbers
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            username.append(randomChar);
        }
        return username.toString() + "@" + domain;
    }

}
