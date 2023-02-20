package by.trayan.algorithms.leetcode.sliding_window;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 */

public class PermutationString {

    public static boolean checkInclusion(String s1, String s2) {
        int length1 = s1.length(), length2 = s2.length();
        if (length1 > length2)
            return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char ch : s1.toCharArray())
            arr1[ch - 'a']++;
        for (int i = 0; i < length2; i++) {
            arr2[s2.charAt(i) - 'a']++;
            if (i >= length1)
                arr2[s2.charAt(i - length1) - 'a']--;
            if (Arrays.equals(arr1, arr2))
                return true;
        }
        return false;
    }
}
