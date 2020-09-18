package com.pbilton.regex;
import org.junit.Test;

import static com.pbilton.regex.Regex_Checker.Regex_Checker;
import static org.junit.Assert.assertEquals;

public class testRegex {

    @Test
    public void testRegex_Checker(){
        assertEquals(true, Regex_Checker("23:45", "\\d\\d:\\d\\d"));
        assertEquals(false, Regex_Checker("23:45", "\\d:\\d\\d"));
    }

    @Test
    public void testValidateTime(){
        assertEquals(true, RegexExamples.validateTime("12:40"));
        assertEquals(false, RegexExamples.validateTime("25:15"));
    }

    @Test
    public void testValidateUser(){
        assertEquals(true, RegexExamples.validateUsr("abc2"));
        assertEquals(false, RegexExamples.validateUsr("adshg675&!"));
    }

    @Test
    public void testVowel(){
        assertEquals(true, RegexExamples.isVowel("a"));
        assertEquals(false, RegexExamples.isVowel("t"));
    }

    @Test
    public void testValidatePhoneNumber(){
        assertEquals(true, RegexExamples.validatePhoneNumber("(567) 145-7755"));
        assertEquals(false, RegexExamples.isVowel("(890)667 9956"));
    }

    @Test
    public void testSplitCapitals(){
        assertEquals("One Two Three", RegexExamples.splitCapitals("OneTwoThree"));
    }

    @Test public void testPasswordHider() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****",RegexExamples.hidePasswordInURL("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
    }

    @Test
    public void testPhoneNumber() {
        assertEquals("(123) 456-7890", RegexExamples.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
