package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsStringTest {

    @Test
    void reverseWords() {
        final String input = "Let's take LeetCode contest";
        final String output = "s'teL ekat edoCteeL tsetnoc";

        Assert.isTrue(ReverseWordsString.reverseWords(input).equals(output), "");
    }
}