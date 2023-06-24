package org.example;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.example.CalendarPrinter.printMonthCalendar;
import static org.example.MagicTriangle.*;
import static org.example.PerfectNumber.calcPerfectNumbers;
import static org.example.PerfectNumber.findProperDivisors;
import static org.example.MorseCode.toMorseCode;
import static org.example.SequencePartition.transformSequenceAB;
import static org.example.SequencePartition.transformSequenceABC;

public class Main {
    public static void main(String[] args) {

//        // 1.task
//        System.out.println("-----Find proper divisors-----");
//        ArrayList divisors1 = findProperDivisors(6);
//        ArrayList divisors2 = findProperDivisors(24);
//        ArrayList divisors3 = findProperDivisors(7);
//
//        System.out.println(divisors1);
//        System.out.println(divisors2);
//        System.out.println(divisors3);
//
//        // 2.task
//        System.out.println("-----Calculate perfect numbers-----");
//        ArrayList perfectNumbers1 = calcPerfectNumbers(1000);
//        ArrayList perfectNumbers2 = calcPerfectNumbers(10000);
//        System.out.println(perfectNumbers1);
//        System.out.println(perfectNumbers2);
//
//        // 3.task
//        System.out.println("-----Calculate perfect numbers-----");
//        String morseCode1 = toMorseCode("SOS");
//        String morseCode2 = toMorseCode("TWEET");
//        // will throw exception
//        String morseCode3 = toMorseCode("WESTB");
//        System.out.println(morseCode1);
//        System.out.println(morseCode2);
//        System.out.println(morseCode3);
//
//
//        //  4.task --> isMagicTriangle(String value)
//        int[][] multiArray1 = {
//                {1},
//                {6, 5},
//                {2, 4, 3}
//        };
//        boolean isMagic1 = isMagicTriangle2D(multiArray1);
//        int[][] multiArray2 = {
//                {2},
//                {8, 5},
//                {4, 9},
//                {3, 7, 6, 1}
//        };
//        boolean isMagic2 = isMagicTriangle2D(multiArray2);
//
//        System.out.println(isMagic1);
//        System.out.println(isMagic2);
//        int[] a = {1, 5, 3, 4, 2, 6};
//        int[] b = {2, 5, 9, 1, 6, 7, 3, 4, 8};
//        System.out.println(isMagicTriangleSingleList(a));
//        System.out.println(isMagicTriangleSingleList(b));

        // 5.task -->   printMonthCalendar(year, month);
//        printMonthCalendar(2023, Month.JUNE);


        // 6.task --> transformSequence(String input)
        String orderedSequence2 = transformSequenceABC("CACCACCCCBBCAACAABCBCBBBACACACCC");
        System.out.println(orderedSequence2);
//
//
//        //  8.task --> Excel Magic sheet
//        List<Integer> numbers1 = ExcelMagicSheet.generateFollowingValues(1, 7);
//        System.out.println(numbers1);
//        List<Integer> numbers2 = ExcelMagicSheet.generateFollowingValues(5, 4);
//        System.out.println(numbers2);
//        List<DayOfWeek> days1 = ExcelMagicSheet.generateFollowingValues(DayOfWeek.FRIDAY, 8);
//        System.out.println(days1);

    }
}