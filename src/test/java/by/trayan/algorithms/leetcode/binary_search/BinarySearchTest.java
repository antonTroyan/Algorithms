package by.trayan.algorithms.leetcode.binary_search;

import by.trayan.algorithms.leetcode.binary_search.BinarySearch;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class BinarySearchTest {

    @Test
    void searchBinary() {
        int[] toFind = {1, 4, 12, 21, 45, 123, 769};

        Assert.isTrue(BinarySearch.search(toFind, 4) == 1, "");
        Assert.isTrue(BinarySearch.search(toFind, 3) == -1, "");
        Assert.isTrue(BinarySearch.search(toFind, 45) == 4, "");
    }

    @Test
    void searchBinaryRecursive() {
        int[] toFind = {1, 4, 12, 21, 45, 123, 769};

        Assert.isTrue(BinarySearch.binarySearchRecursive(toFind, 0, toFind.length - 1, 4) == 1, "");
        Assert.isTrue(BinarySearch.binarySearchRecursive(toFind, 0, toFind.length - 1, 3) == -1, "");
        Assert.isTrue(BinarySearch.binarySearchRecursive(toFind, 0, toFind.length - 1,45) == 4, "");
    }
}