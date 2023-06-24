package org.example;

import java.util.*;

public class DrawFunctionLine {

    public static List<String> generateZickZack(String s, int depth) {
        char[][] line = new char[depth][s.length()];

        for (char[] row : line) {
            Arrays.fill(row, '-');
        }

        int cnt = 0;
        int delta = 1;
        for (int i = 0; i < s.length(); i++) {
            line[cnt][i] = s.charAt(i);
            cnt += delta;
            if (cnt == depth) {
                delta = -1;
                cnt = depth - 2;
            }
            if (cnt <= 0) {
                delta = 1;
                cnt = 0;
            }
        }

        print2DArray(line);

        List<String> result = new ArrayList<>();
        for (char[] row : line) {
            result.add(new String(row));
        }

        return result;
    }

    private static void print2DArray(char[][] line) {
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                System.out.print(line[i][j]);
            }
            System.out.println();
        }
    }
}
