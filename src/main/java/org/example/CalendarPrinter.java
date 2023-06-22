package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarPrinter {

    public static void printMonthCalendar(int year, Month month) {
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        int totalDaysInMonth = date.lengthOfMonth();

        // print header days
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        System.out.println("----------------------------");

        // shift to right for the because of the start day in the month
        int dayOfWeekValue = firstDayOfWeek.getValue() + 1;
        for (int i = 1; i < dayOfWeekValue; i++) {
            System.out.print("   ");
        }

        // print days
        int currentDay = firstDayOfWeek.getValue();
        for (int dayOfMonth = 1; dayOfMonth <= totalDaysInMonth; dayOfMonth++) {
            System.out.printf("   ", dayOfMonth);
            if (currentDay % 7 == 0) {
                System.out.println();
            }
            currentDay++;
        }
    }
}

