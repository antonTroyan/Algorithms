package by.trayan.algorithms.leetcode.chapter1;

import java.util.Arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */

public class SearchInsertPosition {

    public static int searchInsert(int[] array, int target) {
        int index = Arrays.binarySearch(array, target);
        return index < 0 ? -(index + 1) : index;
    }
}
