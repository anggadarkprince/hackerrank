package com.anggaari;

import java.util.Objects;

public class TimeConversion {
    public static void main(String[] args) {
        String input1 = "12:01:00PM"; // Return '12:01:00'
        String input2 = "12:01:00AM"; // Return '00:01:00'
        String input3 = "07:05:45PM"; // Return '19:05:45'
        String input4 = "06:40:03AM"; // Return '06:40:03'

        System.out.println(timeConversion(input1));
        System.out.println(timeConversion(input2));
        System.out.println(timeConversion(input3));
        System.out.println(timeConversion(input4));
    }

    public static String timeConversion(String s) {
        String time = s.substring(0, s.length() - 2);
        String signature = s.substring(s.length() - 2);

        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);

        if (Objects.equals(signature, "AM") && hour >= 12) {
            hour -= 12;
        }
        if (Objects.equals(signature, "PM") && hour < 12) {
            hour += 12;
        }

        String hourPrefixed = String.valueOf(hour);
        if (hour < 10) {
            hourPrefixed = "0" + hour;
        }

        return hourPrefixed + ":" + timeParts[1] + ":" + timeParts[2];
    }
}
