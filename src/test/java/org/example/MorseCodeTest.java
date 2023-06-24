package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.MorseCode.toMorseCode;

public class MorseCodeTest {
    @Test
    @Description("should check correct morseCode conversion")
    void checkToMorseCode() {

        String morseCode1 = toMorseCode("SOS");
        String morseCode2 = toMorseCode("TWEET");

        Assertions.assertEquals("...  ---  ...", morseCode1);
        Assertions.assertEquals("-  .--  .  .  -", morseCode2);
    }

    @Test
    @Description("Should return message after catching the exception")
    void testToMorseCode_IllegalCharacter() {
        Assertions.assertEquals("Illegal Character in String", toMorseCode("TWEETD"));
    }
}
