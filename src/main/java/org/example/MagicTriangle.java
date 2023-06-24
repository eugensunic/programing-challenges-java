package org.example;

import java.util.*;

public class MagicTriangle {

    public MagicTriangle() {
    }

    public static boolean isMagicTriangle2D(int[][] multiArray) {
        int leftSum = 0;
        int rightSum = 0;
        int downSum = 0;

        for (int i = 0; i < multiArray.length; i++) {
            int[] row = multiArray[i];
            leftSum += row[0];
            rightSum += row[row.length - 1];
        }
        // make 3 groups
        int[] lastRow = multiArray[multiArray.length - 1];
        for (int i = 0; i < lastRow.length; i++) {
            downSum += lastRow[i];
        }

        return leftSum == rightSum && rightSum == downSum;
    }

    public static boolean isMagicTriangleSingleList(int[] list) {
        int totalLength = list.length + 3;
        try {
            if (totalLength % 3 != 0) throw new IllegalArgumentException("Invalid divisor");
        } catch (IllegalArgumentException e) {
            System.out.print(e);
        }
        int divisor = totalLength / 3;
        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            arr.get(index).add(list[i]);
            if (arr.get(index).size() % divisor == 0) {
                index++;
                arr.get(index).add(list[i]);
            }
        }

        arr.get(index).add(list[0]);

        int[] arrSum = new int[3];
        for (int i = 0; i < arr.size(); i++) {
            for (int j : arr.get(i)) {
                arrSum[i] += j;
            }
        }
        return arrSum[0] == arrSum[1] && arrSum[1] == arrSum[2];
    }
}
