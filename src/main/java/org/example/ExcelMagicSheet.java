package org.example;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ExcelMagicSheet {

    public static List<DayOfWeek> generateFollowingValues(DayOfWeek start, int count) {
        List<DayOfWeek> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int dayValue = (start.getValue() + i - 1) % 7 + 1;
            DayOfWeek day = DayOfWeek.of(dayValue);
            list.add(day);
        }
        return list;
    }

    public static List<Integer> generateFollowingValues(int start, int count) {
        if (count < 0) throw new IllegalArgumentException("Argument should be greater or equal to zero");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(start + i);
        }
        return list;
    }


}