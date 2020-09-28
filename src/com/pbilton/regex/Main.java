package com.pbilton.regex;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("******** Regular Expression Program ********");
        System.out.println("Please select one of the following: ");
        System.out.println("    1- Regex Checker");
        System.out.println("    2- Regex Revision");
        System.out.println("    3- Examples");
        System.out.print("Selection: ");
        int selection = scanner.nextInt();

        if(selection == 1)
            Regex_Checker.Regex_Checker();
        else if(selection == 2)
            RegexRevisionPrint.Menu();
        else if(selection == 3)
            RegexExamples.RegexExamplesMenu();
    }
}

