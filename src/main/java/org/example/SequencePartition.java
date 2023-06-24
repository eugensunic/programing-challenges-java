package org.example;

public class SequencePartition {
    public SequencePartition() {
    }

    public static String transformSequenceAB(String input) {
        char[] str = input.toCharArray();
        int l = 0;
        int r = str.length - 1;

        while (l < r) {
            if (str[l] == 'B' && str[r] == 'A') {
                str[l] = 'A';
                str[r] = 'B';
                l++;
                r--;
            } else if (str[l] == 'A') {
                l++;
            } else if (str[r] == 'B') {
                r--;
            } else {
                if (str[l] == 'C') {
                    l++;
                } else {
                    r--;
                }
            }

        }

        return new String(str);
    }

    public static String transformSequenceABC(String input) {
        String orderedAB = input;
        int aIndex = 0, bIndex = 0, cIndex = orderedAB.length() - 1;
        System.out.println(orderedAB);
        char[] str = orderedAB.toCharArray();
        while (bIndex <= cIndex) {
            if (str[bIndex] == 'A') {
                swap(str, aIndex++, bIndex++);
            } else if (str[bIndex] == 'B') {
                bIndex++;
            } else if (str[bIndex] == 'C') {
                swap(str, bIndex, cIndex--);
            } else {
                throw new IllegalArgumentException("Should only have contain A-C characters");
            }
        }
        return new String(str);
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}


