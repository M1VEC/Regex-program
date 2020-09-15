package com.pbilton.regex;

public class RegexExamples {

    public static void RegexExamplesMenu(){
        System.out.println("Regex Examples");
        System.out.println("1- Numbers");
        System.out.println("2- Dates and times");
        System.out.println("3- Validate usernames and passwords");
    }

    public static boolean isVowel(String s) {
        return s.matches("[aAeEiIoOuU]");
    }

    public static boolean validateTime(String time) {
        boolean match = time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        return match;
    }

    public static boolean validateUsr(String s) {
        int length = s.length();
        if(length >= 4 && length <= 16)
            return s.matches("^[a-z0-9_]+$");
        else
            return false;
    }
}
