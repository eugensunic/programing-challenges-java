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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(start + i);
        }
        return list;
    }

    //hash map implementation
//    private static final HashMap<String, Integer> daysOfWeek;
//    static {
//        daysOfWeek = new HashMap<>();
//        daysOfWeek.put("Monday", 1);
//        daysOfWeek.put("Tuesday", 2);
//        daysOfWeek.put("Wednesday", 3);
//        daysOfWeek.put("Thursday", 4);
//        daysOfWeek.put("Friday", 5);
//        daysOfWeek.put("Saturday", 6);
//        daysOfWeek.put("Sunday", 7);
//    }

}