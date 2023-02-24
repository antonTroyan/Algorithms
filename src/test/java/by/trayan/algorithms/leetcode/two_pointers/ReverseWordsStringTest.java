package by.trayan.algorithms.leetcode.two_pointers;

import by.trayan.algorithms.leetcode.two_pointers.ReverseWordsString;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ReverseWordsStringTest {

    @Test
    void reverseWords() {
        final String input = "Let's take LeetCode contest";
        final String output = "s'teL ekat edoCteeL tsetnoc";

        Assert.isTrue(ReverseWordsString.reverseWords(input).equals(output), "");
    }
}