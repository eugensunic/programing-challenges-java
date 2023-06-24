package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.MagicTriangle.isMagicTriangle2D;

public class MagicTriangleTest {

    @Test
    @Description("Test that isMagicTriangle2D() correctly identifies magic triangles")
    void testIsMagicTriangle2D() {
        int[][] multiArray1 = {
                {1},
                {6, 5},
                {2, 4, 3}
        };

        int[][] multiArray2 = {
                {2},
                {8, 5},
                {4, 9},
                {3, 7, 6, 1}
        };

        int[][] multiArray3 = {
                {3},
                {8, 5},
                {4, 9},
                {3, 7, 6, 1}
        };

        Assertions.assertTrue(isMagicTriangle2D(multiArray1));
        Assertions.assertTrue(isMagicTriangle2D(multiArray2));
        Assertions.assertFalse(isMagicTriangle2D(multiArray3));
    }
}
