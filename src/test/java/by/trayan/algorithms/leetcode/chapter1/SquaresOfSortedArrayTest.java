package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    @Test
    void sortedSquares() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};

        Assert.isTrue(Arrays.compare(SquaresOfSortedArray.sortedSquares(input), output) == 0, "");
    }
}