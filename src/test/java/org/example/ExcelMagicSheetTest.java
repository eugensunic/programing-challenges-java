package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

public class ExcelMagicSheetTest {
    @Test
    @Description("should include values from start number and display subsequent numbers till count")
    void checkSubsequentValues() {
        List<Integer> expectedList1 = Arrays.asList(5, 6, 7, 8);
        Assertions.assertEquals(expectedList1, ExcelMagicSheet.generateFollowingValues(5, 4));

        List<Integer> expectedList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Assertions.assertEquals(expectedList2, ExcelMagicSheet.generateFollowingValues(1, 7));

        // empty list
        List<Integer> expectedList3 = Arrays.asList();
        Assertions.assertEquals(expectedList3, ExcelMagicSheet.generateFollowingValues(0, 0));
    }


    @Test
    @Description("should include WeekDays from start to end date")
    void checkSubsequentWeekDayValues() {
        List<DayOfWeek> expectedList = Arrays.asList(
                DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY,
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY
        );
        Assertions.assertEquals(expectedList, ExcelMagicSheet.generateFollowingValues(DayOfWeek.FRIDAY, 8));
    }

    @Test
    @Description("should throw an exception if count is less than 0")
    void checkInvalidCount() {
        int start = 5;
        int count = -3;

        Assertions.assertThrows(IllegalArgumentException.class, () -> ExcelMagicSheet.generateFollowingValues(start, count));
    }
}
