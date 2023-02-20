package by.trayan.algorithms.leetcode;

import by.trayan.algorithms.leetcode.two_pointers.SquaresOfSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

class SquaresOfSortedArrayTest {

    @Test
    void sortedSquares() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};

        Assert.isTrue(Arrays.compare(SquaresOfSortedArray.sortedSquares(input), output) == 0, "");
    }
}