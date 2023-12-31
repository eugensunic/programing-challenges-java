package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class PerfectNumberTest {
    @Test
    @Description("Test findProperDivisors() method")
    void testFindProperDivisors() {
        ArrayList<Integer> expectedDivisors1 = new ArrayList<>();
        expectedDivisors1.add(1);
        expectedDivisors1.add(2);
        expectedDivisors1.add(3);
        expectedDivisors1.add(4);
        expectedDivisors1.add(6);
        ArrayList<Integer> divisors1 = PerfectNumber.findProperDivisors(12);
        Assertions.assertEquals(expectedDivisors1, divisors1);

        ArrayList<Integer> expectedDivisors2 = new ArrayList<>();
        ArrayList<Integer> divisors2 = PerfectNumber.findProperDivisors(0);
        Assertions.assertEquals(expectedDivisors2, divisors2);

        ArrayList<Integer> expectedDivisors3 = new ArrayList<>();
        ArrayList<Integer> divisors3 = PerfectNumber.findProperDivisors(-1);
        Assertions.assertEquals(expectedDivisors3, divisors3);
    }

    @Test
    @DisplayName("Test calcPerfectNumbers() method")
    void testCalcPerfectNumbers() {
        ArrayList<Integer> expectedPerfectNumbers1 = new ArrayList<>();
        expectedPerfectNumbers1.add(6);
        expectedPerfectNumbers1.add(28);
        ArrayList<Integer> perfectNumbers1 = PerfectNumber.calcPerfectNumbers(100);
        Assertions.assertEquals(expectedPerfectNumbers1, perfectNumbers1);

        ArrayList<Integer> expectedPerfectNumbers2 = new ArrayList<>();
        ArrayList<Integer> perfectNumbers2 = PerfectNumber.calcPerfectNumbers(0);
        Assertions.assertEquals(expectedPerfectNumbers2, perfectNumbers2);

        ArrayList<Integer> expectedPerfectNumbers3 = new ArrayList<>();
        ArrayList<Integer> perfectNumbers3 = PerfectNumber.calcPerfectNumbers(-1);
        Assertions.assertEquals(expectedPerfectNumbers3, perfectNumbers3);
    }
}
