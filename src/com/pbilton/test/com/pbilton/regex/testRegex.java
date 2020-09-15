package com.pbilton.regex;
import org.junit.Test;

import static com.pbilton.regex.Regex_Checker.Regex_Checker;
import static org.junit.Assert.assertEquals;

public class testRegex {

    @Test
    public void testRegex(){
        assertEquals(true, Regex_Checker("23:45", "\\d\\d:\\d\\d"));
        assertEquals(false, Regex_Checker("23:45", "\\d:\\d\\d"));

    }
}
