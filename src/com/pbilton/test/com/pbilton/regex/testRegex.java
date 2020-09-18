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
}
