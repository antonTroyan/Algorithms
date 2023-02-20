package by.trayan.algorithms.leetcode;

import by.trayan.algorithms.leetcode.two_pointers.RotateArray;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

class RotateArrayTest {

    @Test
    void rotate() {
        final int[] input = {1,2,3,4,5,6,7};
        final int[] output = {5,6,7,1,2,3,4};
        final int steps = 3;

        RotateArray.rotate(input, steps);
        Assert.isTrue(Arrays.compare(input, output) == 0, "");
    }
}