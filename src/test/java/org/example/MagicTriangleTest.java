package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.MagicTriangle.isMagicTriangle2D;
import static org.example.MagicTriangle.isMagicTriangleSingleList;

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

    @Test
    @Description("Test that isMagicTriangleSingleList() correctly identifies magic triangles")
    void testIsMagicTriangleSingleList() {
        Assertions.assertTrue(isMagicTriangleSingleList(new int[]{1, 5, 3, 4, 2, 6}));
        Assertions.assertTrue(isMagicTriangleSingleList(new int[]{2, 5, 9, 1, 6, 7, 3, 4, 8}));
        Assertions.assertFalse(isMagicTriangleSingleList(new int[]{3, 5, 9, 1, 6, 7, 3, 4, 8}));
    }
}
