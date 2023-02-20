package by.trayan.algorithms.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PermutationStringTest {

    @Test
    void checkInclusion() {
        final String s1 = "ab", s2 = "eidbaooo";

        Assert.isTrue(PermutationString.checkInclusion(s1, s2), "");
    }
}