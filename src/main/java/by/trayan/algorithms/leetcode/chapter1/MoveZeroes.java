package by.trayan.algorithms.leetcode.chapter1;

import by.trayan.algorithms.Algorithm;
import org.springframework.stereotype.Component;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

@Component
public class MoveZeroes implements Algorithm {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int element: nums) {
            if (element != 0) nums[insertPos++] = element;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    private static void swap(int[] array, int changeFromIndex, int changeToIndex) {
        int temp = array[changeFromIndex];
        array[changeFromIndex] = array[changeToIndex];
        array[changeToIndex] = temp;
    }
}
