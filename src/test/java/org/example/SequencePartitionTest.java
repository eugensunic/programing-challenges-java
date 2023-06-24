package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.example.SequencePartition.transformSequenceAB;
import static org.example.SequencePartition.transformSequenceABC;

public class SequencePartitionTest {

    @ParameterizedTest
    @Description("should check for sorted characters")
    @ValueSource(strings = {"ABBAAABAA", "BABAAAAAB", "AAAAAABBB", "BBBAAAAAA"})
    void checkTransformSequenceAB(String input) {
        String orderedSequence = transformSequenceAB(input);
        Assertions.assertEquals("AAAAAABBB", orderedSequence);

    }

    @Test
    @Description("should check for empty string input")
    void checkTransformSequenceAB() {
        String orderedSequence = transformSequenceAB("");
        Assertions.assertEquals("", orderedSequence);

    }

    @ParameterizedTest
    @Description("should check for sorted characters")
    @ValueSource(strings = {"ABCBAABCCABC", "CCCCAAAABBBB", "CCCCBBBBAAAA"})
    void checkTransformSequenceABc(String input) {
        String orderedSequence = transformSequenceABC(input);
        Assertions.assertEquals("AAAABBBBCCCC", orderedSequence);

    }

    @Test
    @Description("should check for empty string input")
    void checkTransformSequenceABC() {
        String orderedSequence = transformSequenceABC("");
        Assertions.assertEquals("", orderedSequence);

    }

}
