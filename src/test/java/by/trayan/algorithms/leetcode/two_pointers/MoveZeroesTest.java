package by.trayan.algorithms.leetcode.two_pointers;

import by.trayan.algorithms.leetcode.two_pointers.MoveZeroes;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        final int[] input = {0, 1, 0, 3, 12};
        final int[] output = {1, 3, 12, 0, 0};

        MoveZeroes.moveZeroes(input);
        Assert.isTrue(Arrays.compare(input, output) == 0, "");
    }
}