package by.trayan.algorithms.leetcode.two_pointers;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while
 * still preserving whitespace and initial word order.
 * </p>
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 */

public class ReverseWordsString {

    // Approach:
    // Using two pointers, 'start' and 'end', each time 'end' reaches a space, we reverse the words before.
    // To reverse, we convert the String 's' to a char array, then write a method to reverse the char in the array.

    public static String reverseWords(String input) {
        // Convert input into char array.
        char[] inputChars = input.toCharArray();

        int start = 0;
        for (int end = 0; end <= inputChars.length; end++) {
            // When 'end' reaches a space character ' ', reverse the words from 'start' to 'end' - 1 index in 'inputChars'.
            if (end == inputChars.length || inputChars[end] == ' ') {
                reverseWord(inputChars, start, end - 1);
                // reset the start for the next word.
                start = end + 1;
            }
        }
        return new String(inputChars);
    }

    // A private method to reverse the char in the array using the 'start' and 'end' pointer.
    private static void reverseWord(char[] array, int start, int end) {
        while (start < end) {
            char tmp = array[end];
            array[end] = array[start];
            array[start] = tmp;
            start++;
            end--;
        }
    }
}
