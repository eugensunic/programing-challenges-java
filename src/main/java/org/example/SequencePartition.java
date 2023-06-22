package org.example;

public class SequencePartition {
    public SequencePartition() {
    }

    public static String transformSequence(String input) {
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
                throw new IllegalStateException("Illegal character found, current chars: " + str[l] + str[r]);
            }


        }

        return new String(str);
    }
}
