package com.pbilton.regex;

import java.util.Scanner;

public class RegexRevisionPrint {
    private static Scanner scanner = new Scanner(System.in);

    public static int RevisionMenu(){
        System.out.println("Revision Options:");
        System.out.println("    1- Character Classes");
        System.out.println("    2- Custom Character Classes");
        System.out.println("    3- Ranges");
        System.out.println("    4- Negation");
        System.out.println("    5- Matching Multiple Characters");
        System.out.println("    6- Escapes");
        System.out.println("    7- Group Characters");
        System.out.println("    8- Pattern and Matcher Class");
        System.out.println();
        System.out.println("Selection No: ");
        return scanner.nextInt();
    }

    public static void Menu(){
        int menu = RevisionMenu();
        if (menu == 1)
            characterClasses();
        else if (menu == 2)
            customCharacterClasses();
        else if (menu == 3)
            ranges();
        else if (menu == 4)
            negation();
        else if (menu == 5)
            matchingMultipleChars();
        else if(menu == 6)
            escapes();
        else if (menu == 7)
            groupCharacters();
        else if (menu == 8)
            patternMatcherClass();
    }

    private static void characterClasses() {
        System.out.println("Predefined Character Classes");
        System.out.println(".   Any character. Acts like a wildcard and will match any character");
        System.out.println("\\d     Any digit(0-9)");
        System.out.println("\\D     Any nondigit(not 0-9)");
        System.out.println("\\s     Any whitespace character");
        System.out.println("\\S     Any character that isn't a whitespace");
        System.out.println("\\w     Any word character(a-z, A-Z, 0-9 or _");
        System.out.println("\\W     Any character other than a word character");
    }

    private static void customCharacterClasses() {
        System.out.println("Custom Character Classes");
        System.out.println("    To create a custom character class, wrap the required class using square brackets");
        System.out.println("    [cC][aA][rR]");
        System.out.println("    This will match car, CaR, cAr etc but will not match arc");
    }

    private static void ranges() {
        System.out.println("Ranges");
        System.out.println("    Using ranges with custom character classes to specify what to match");
        System.out.println("    [a-m][0-5]");
        System.out.println("    This will match any letters between a and m and then any number from 1 to 5");
        System.out.println("    You can use more than one range in a custom character class");
        System.out.println("    [a-zA-Z]");
    }

    private static void negation() {
        System.out.println("Negation");
        System.out.println("You can also specify what not to match using ^ at the start of the character class");
        System.out.println("[^c][aA][rR]");
        System.out.println("This will not match car, but will match bar, tar, par etc");
    }

    private static void matchingMultipleChars() {
    }

    private static void escapes() {
    }

    private static void groupCharacters() {
    }

    private static void patternMatcherClass() {
    }
}
