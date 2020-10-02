package com.pbilton.regex;

import java.util.Scanner;

public class RegexRevisionPrint {
    private static Scanner scanner = new Scanner(System.in);

    private static int RevisionMenu(){
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
        System.out.println("\\w     Any word character(a-z, A-Z, 0-9 or _)");
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
        System.out.println("    You can also specify what not to match using ^ at the start of the character class");
        System.out.println("    [^c][aA][rR]");
        System.out.println("    This will not match car, but will match bar, tar, par etc");
    }

    private static void matchingMultipleChars() {
        System.out.println("Matching Multiple Characters");
        System.out.println("To create more flexible patterns, we use Quantifiers");
        System.out.println("?      Zero or one time");
        System.out.println("*      Zero or more times");
        System.out.println("+      One or more times");
        System.out.println("{n}     Exactly n times");
        System.out.println("{n,}    At least n times");
        System.out.println("{n,m}   At least n times but no more than m times");
        System.out.println();
        System.out.println("\\d{3}-?\\d{2}-?\\d{4}");
        System.out.println("This will match 779-48-9955 and also 779489955 as the ? states zero or one times");
    }

    private static void escapes() {
        System.out.println("Escapes");
        System.out.println("    To search special characters using Regular expressions like \\,() etc then we need to ");
        System.out.println("    escape them by using a backslash. ");
    }

    private static void groupCharacters() {
        System.out.println("Group Characters");
        System.out.println("    We use () to create groups of characters, these groups can then be applied latter in the expression.");
        System.out.println("    (\\(\\d{3}\\)\\s?)?\\d{3}-\\d{4}");
        System.out.println("    This regex looks a little complicated but it can be broken down. (\\(\\d{3}\\)\\s?)? the second ( is escaped");
        System.out.println("    so this needs to be in the match, this is followed by 3 digits and the closing ). Then an optional white-space character.");
        System.out.println("    Once the group is closed it is followed by a ? This means the entire group is optional.");
        System.out.println();
        System.out.println("    These groups that are captured using the () can be used later in the pattern. A good example is naming of");
        System.out.println("    droids like R2-D2. If we wanted to make sure the 2nd digit matches the first digit we can use the following format:");
        System.out.println("    \\w(\\d)-\\w\1");
        System.out.println("    The \\1 refers to the first capture group as the first digit is wrapped in the ().");
    }

    private static void patternMatcherClass() {
        System.out.println("Pattern and Matcher Classes");
        System.out.println("    If you intend to write a program that will be using a lot of regular expression then you should");
        System.out.println("    use the pattern and matcher classes. The pattern class represents a regular expression that can be executable.");
        System.out.println("    Then the pattern object is used to create a Matcher object which is used to match against strings.");
        System.out.println("    When we create a pattern object it needs to be compiled and this can throw a PatternSyntaxException, because of this");
        System.out.println("    we must use a try/catch statement.");
        System.out.println();
        System.out.println("    After a pattern object is created we can use the Matcher method to create an instance of the Matcher class.");
        System.out.println("    The following example is how to use these methods.");
        System.out.println("private static Pattern droidPattern;");
        System.out.println("private static boolean validDroidName(String droid){");
        System.out.println("    if(droidPattern == null)");
        System.out.println("    {");
        System.out.println("        String regex = \"(\\w\\d-zzw\\d|(\\w-\\d\\w\\w)\"");
        System.out.println("        droidPattern = Pattern.compile(regex)");
        System.out.println("    }");
        System.out.println("    Matcher m = droidPattern.matcher(droid)");
        System.out.println("    return m.matches()");
        System.out.println("}");
        System.out.println("    In this example droidPattern is assigned the compiled pattern String regex. Then the matcher object is created and ");
        System.out.println("    the string droid is passed as a parameter and is validated against droidPattern. The program then returns a boolean if a");
        System.out.println("    match is found.");
    }
}
