package by.trayan.algorithms.leetcode.sliding_window;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

//    public boolean checkInclusion(String s1, String s2) {
//        int n1 = s1.length(), n2 = s2.length();
//        if (n1 > n2){
//            return false;
//        }
//        int[] arr1 = new int[26];
//        int[] arr2 = new int[26];
//        for (char ch : s1.toCharArray()){
//            arr1[ch - 'a']++;
//        }
//        for (int i = 0; i < n2; i++) {
//            arr2[s2.charAt(i) - 'a']++;
//            if (i >= n1){
//                arr2[s2.charAt(i - n1) - 'a']--;
//            }
//            if (Arrays.equals(arr1, arr2))
//                return true;
//        }
//        return false;
//    }

    public boolean checkInclusion(String s1, String s2) {
        final Set<Character> set = new HashSet<>();
        for (Character temp : s1.toCharArray()) {
            set.add(temp);
        }
        final int s1Length = set.size();
        int counter = 0;
        for (Character temp : s2.toCharArray()) {
            if (set.contains(temp)) counter++;
            else counter = 0;

            if (s1Length == counter)
                return true;
        }
        return false;
    }
}
