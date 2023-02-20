package by.trayan.algorithms.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {

    @Test
    void lengthOfLongestSubstring() {
        final String input = "abcabcbb";

        Assert.isTrue(LongestSubstringWithoutRepeating.lengthOfLongestSubstring(input) == 3, "");
    }
}