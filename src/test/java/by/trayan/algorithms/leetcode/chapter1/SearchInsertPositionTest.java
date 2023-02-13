package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        int[] array = {2, 3, 4, 12, 45, 23};

        Assert.isTrue(SearchInsertPosition.searchInsert(array, 3) == 1, "");
        Assert.isTrue(SearchInsertPosition.searchInsert(array, 7) == 3, "");

    }
}