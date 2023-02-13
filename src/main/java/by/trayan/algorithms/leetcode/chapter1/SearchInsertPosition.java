package by.trayan.algorithms.leetcode.chapter1;

import java.util.Arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] array, int target) {
        int index = Arrays.binarySearch(array, target);
        return index < 0 ? -(index + 1) : index;
    }
}
