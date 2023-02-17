package by.trayan.algorithms.leetcode.chapter1;

import by.trayan.algorithms.Algorithm;
import org.springframework.stereotype.Component;

/**
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

@Component
public class RotateArray implements Algorithm {

    public static void rotate(int[] nums, int steps) {
        steps %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, steps - 1);
        reverse(nums, steps, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
