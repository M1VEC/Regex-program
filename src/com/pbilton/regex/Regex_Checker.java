package com.pbilton.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Checker {
    private static String regex;
    private static String string;
    private static Pattern pattern;
    private static Matcher matcher;
    private static boolean validRegex;
    private static boolean doneMatching;
    private static boolean matchFound;
    private static Scanner scanner = new Scanner(System.in);

    public static void Regex_Checker(){
        System.out.println("***Regex Checker***");
        do{
            Regex_Input();
            doneMatching = false;
            matchFound = false;
            while(!doneMatching) {
                string_Input();
                if (matchFound == true){
                    System.out.println("Match Found");
                System.out.println(matcher.group(0));}
                else
                    System.out.println("No match found");
            }
        } while (Continue());
    }

    //Overload method to pass a predetermined string and pattern
    public static boolean Regex_Checker(String string, String regex) {
        validateInput(regex);
        return matcher(string);
    }

    private static void Regex_Input(){
        do{
            System.out.println("Enter regex expression: ");
            regex = scanner.nextLine();
            validRegex = validateInput(regex);
        } while (!validRegex);
    }

    private static boolean validateInput(String input){
        try {
            pattern = Pattern.compile(input);
            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void string_Input(){
        System.out.println("Enter string: ");
        string = scanner.nextLine();
        if (string.length() == 0)
            doneMatching = true;    //if string is blank, ends current Regex checker
        else
            matcher(string);
    }

    private static boolean matcher(String input){
        matcher = pattern.matcher(input);
        if (matcher.matches()){
            return matchFound = true;
        }
        else {
            return matchFound = false;
        }
    }

    private static boolean Continue(){
        System.out.println("New expression: Y or N");
        String reply = scanner.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
}
