package by.trayan.algorithms.leetcode.chapter1;

import by.trayan.algorithms.Algorithm;
import org.springframework.stereotype.Component;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * <p>
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * <p>
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */

@Component
public class SquaresOfSortedArray implements Algorithm {

    public static int[] sortedSquares(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int index = numbers.length - 1;
        int[] result = new int[numbers.length];
        while (left <= right) {
            if (Math.abs(numbers[left]) > Math.abs(numbers[right])) {
                result[index] = numbers[left] * numbers[left];
                left++;
            } else {
                result[index] = numbers[right] * numbers[right];
                right--;
            }
            index--;
        }
        return result;
    }
}
