package by.trayan.algorithms.leetcode.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int slowPointer = 0, mainPointer = 0, max = 0;
        final Set<Character> set = new HashSet<>();

        while (mainPointer < s.length()) {
            if (!set.contains(s.charAt(mainPointer))) {
                set.add(s.charAt(mainPointer++));
                max = Math.max(max, set.size());
            } else set.remove(s.charAt(slowPointer++));
        }
        return max;
    }
}
