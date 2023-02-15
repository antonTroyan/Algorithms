package by.trayan.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        int [] testArray = {13, -32, 4, 12, 1, 54, -3, 21};
        int [] arrayToCompare = Arrays.copyOf(testArray, testArray.length);

        QuickSort.quickSort(testArray, 0, testArray.length - 1);
        Arrays.sort(arrayToCompare);

        Assert.isTrue(Arrays.equals(testArray, arrayToCompare), "");
    }
}