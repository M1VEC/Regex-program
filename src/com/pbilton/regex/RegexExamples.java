package com.pbilton.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExamples {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void RegexExamplesMenu(){
        System.out.println("Regex Examples");
        System.out.println("1- Numbers");
        System.out.println("2- Dates and times");
        System.out.println("3- Validate usernames and passwords");
    }

    //*************Numbers******************************
    public static boolean validatePhoneNumber(String number){
        pattern = Pattern.compile("\\((\\d){3}\\) (\\d){3}-(\\d){4}");
        matcher = pattern.matcher(number);
        return matcher.matches();
    }

     public static String createPhoneNumber(int[] numbers) {
        String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";
        Integer[] numbersInt = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        return String.format(PHONE_FORMAT, numbersInt);
    }

    //*************Strings******************************

    public static boolean isVowel(String s) {
        return s.matches("[aAeEiIoOuU]");
    }

    public static String splitCapitals(String string){
        String[] list = string.split("(?=[A-Z])");
        String result = "";
        for (int i = 0; i<list.length; i++)
            result = result + " " + list[i];
        return result.trim();
    }

    //*************Dates & Times************************

    public static boolean validateTime(String time) {
        boolean match = time.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        return match;
    }

    //*************Username & Passwords*****************

    public static boolean validateUsr(String s) {
        int length = s.length();
        if(length >= 4 && length <= 16)
            return s.matches("^[a-z0-9_]+$");
        else
            return false;
    }

    public static String hidePasswordInURL(String urlString) {
        Matcher match = Pattern.compile("(?<=password=).+?(?=&|\\z)").matcher(urlString);   //will match contents after password= and before &
        int length = match.find() ? match.group().length() : 0;
        String result = match.replaceAll("*".repeat(length));
        return result;
    }
}
