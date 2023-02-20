package by.trayan.algorithms.leetcode;

import by.trayan.algorithms.leetcode.two_pointers.TwoSumII;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

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