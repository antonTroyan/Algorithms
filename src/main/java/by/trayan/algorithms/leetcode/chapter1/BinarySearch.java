package by.trayan.algorithms.leetcode.chapter1;

import by.trayan.algorithms.Algorithm;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements Algorithm {

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }


    public static int binarySearchRecursive(int[] array, int left, int right, int target) {
        if (right >= left && left <= array.length - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
                return mid;
            if (array[mid] > target)
                return binarySearchRecursive(array, left, mid - 1, target);
            return binarySearchRecursive(array, mid + 1, right, target);
        }
        return -1;
    }
}
