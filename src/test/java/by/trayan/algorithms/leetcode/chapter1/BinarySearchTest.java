package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class BinarySearchTest {

    @Test
    void search() {
        int[] toFind = {1, 4, 12, 21, 45, 123, 769};

        Assert.isTrue(BinarySearch.search(toFind, 4) == 1, "");
        Assert.isTrue(BinarySearch.search(toFind, 3) == -1, "");
        Assert.isTrue(BinarySearch.search(toFind, 45) == 4, "");
    }
}