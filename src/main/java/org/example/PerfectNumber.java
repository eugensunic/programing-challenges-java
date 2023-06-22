package org.example;

import java.util.ArrayList;

public class PerfectNumber {
    public PerfectNumber() {
    }

    public static ArrayList<Integer> findProperDivisors(int num) {
        ArrayList<Integer> output = new ArrayList<>();
        if (num <= 0) return output;
        for (int i = 1; i <= Math.floorDiv(num, 2); i++) {
            if (num % i == 0) {
                output.add(i);
            }
        }
        return output;
    }

    public static ArrayList<Integer> calcPerfectNumbers(int maxNum) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int num = 1; num <= maxNum; num++) {
            int sum = 0;
            for (int i = 1; i <= Math.floorDiv(num, 2); i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                output.add(num);
            }
        }
        return output;
    }
}
