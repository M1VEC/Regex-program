package com.pbilton.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChecker {

    private static String regex;
    private static String string;
    private static Pattern pattern;
    private static Matcher matcher;
    private static boolean validRegex;
    private static boolean doneMatching;
    private static Scanner scanner = new Scanner(System.in);

    public static void Regex_Checker(){
            System.out.println("Regex Tester");
            do{
                do{
                    System.out.println("\nEnter regex expression: ");
            regex = scanner.nextLine();
            validRegex = true;
            try
            {
                pattern = Pattern.compile(regex);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                validRegex = false;
            }
        } while (!validRegex);

        doneMatching = false;
        while(!doneMatching) {
            System.out.println("Enter string: ");
            string = scanner.nextLine();
            if (string.length() == 0)
                doneMatching = true;
            else {
                matcher = pattern.matcher(string);
                if (matcher.matches())
                    System.out.println("Match found");
                else
                    System.out.println("No match found");
            }
        }
            } while (askAgain());
    }

    private static boolean askAgain(){
        System.out.println("New expression: Y or N");
        String reply = scanner.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
}



