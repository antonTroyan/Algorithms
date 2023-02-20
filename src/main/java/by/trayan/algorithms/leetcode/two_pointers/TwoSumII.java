package by.trayan.algorithms.leetcode.two_pointers;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers
 * such that they add up to a specific target number. Let these two numbers be numbers[index1]
 * and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * </p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array
 * [index1, index2] of length 2.
 * </p>
 * Example
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 0, index2 = 1. We return [0, 1].
 */

public class TwoSumII {

    //  Since the question said there is EXACTLY one solution and didn't provide any info about when
    //  there is no valid answer, so we can always assume there is one and only one answer, which means
    //  l and r never across each other.
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target)
                right--;
            else left++;
        }
        return new int[]{left, right};
    }
}
