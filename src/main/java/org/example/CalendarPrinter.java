package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class CalendarPrinter {

    public static void printMonthCalendar(int year, Month month) {
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        int totalDaysInMonth = date.lengthOfMonth();

        // print header days
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        System.out.println("-----------------------------");

        // shift to right for the start day in the month
        int dayOfWeekValue = firstDayOfWeek.getValue();
        for (int i = 1; i < dayOfWeekValue; i++) {
            System.out.print("    ");
        }

        // print days
        int currentDay = dayOfWeekValue;
        for (int dayOfMonth = 1; dayOfMonth <= totalDaysInMonth; dayOfMonth++) {
            if (dayOfMonth < 10) {
                System.out.print("   " + dayOfMonth);
            } else {
                System.out.print("  " + dayOfMonth);
            }
            currentDay++;
            if (currentDay % 8 == 0) {
                System.out.println();
                currentDay = 1;
            }
        }

        if ((currentDay - 1) % 7 != 0) {
            System.out.println();
        }
    }


}

