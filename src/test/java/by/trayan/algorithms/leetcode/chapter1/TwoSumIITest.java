package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {

    @Test
    void twoSum() {
        final int[] input = {2, 7, 11, 15};
        final int[] output = {0, 1};

        Assert.isTrue(Arrays.compare(
                TwoSumII.twoSum(input, 9), output)
                == 0,
                "");
    }
}