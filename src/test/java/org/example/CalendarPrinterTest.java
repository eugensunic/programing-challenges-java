package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.time.Month;

public class CalendarPrinterTest {

    @Test
    @Description("should check for chars sort")
    void checkPrintMonthCalendar() {

        CalendarPrinter.printMonthCalendar(2023, Month.JUNE);

    }
}
