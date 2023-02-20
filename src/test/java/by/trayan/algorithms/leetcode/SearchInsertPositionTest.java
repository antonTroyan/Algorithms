package by.trayan.algorithms.leetcode;

import by.trayan.algorithms.leetcode.binary_search.SearchInsertPosition;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        int[] array = {2, 3, 4, 12, 45, 23};

        Assert.isTrue(SearchInsertPosition.searchInsert(array, 3) == 1, "");
        Assert.isTrue(SearchInsertPosition.searchInsert(array, 7) == 3, "");

    }
}