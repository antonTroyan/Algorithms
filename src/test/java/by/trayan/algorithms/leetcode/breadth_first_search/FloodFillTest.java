package by.trayan.algorithms.leetcode.breadth_first_search;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

class FloodFillTest {

    @Test
    void floodFill() {
        final int[][] input = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}};
        final int[][] output = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}};
        Assert.isTrue(Arrays.deepEquals(FloodFill.floodFill(input, 1, 1, 2), output), "");
    }
}