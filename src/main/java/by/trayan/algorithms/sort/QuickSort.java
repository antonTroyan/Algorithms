package by.trayan.algorithms.sort;

/**
 * In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the
 * full n-sized list needs O(n). Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each.
 * As a result, the QuickSort algorithm has the complexity of O(n log n).
 * <p>
 * Worst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest
 * or smallest element. Suppose, if the pivot element is always the last element of the array, the worst case would
 * occur when the given array is sorted already in ascending or descending order. The worst-case time
 * complexity of quicksort is O(n2).
 * <p>
 * On the average QuickSort has O(n log n) complexity, making it suitable for big data volumes.
 */

public class QuickSort {

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int pIndex = begin;

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                swap(array, pIndex, j);
                pIndex++;
            }
        }
        // place pivot in the proper place
        swap(array, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] array, int changeFromIndex, int changeToIndex) {
        int temp = array[changeFromIndex];
        array[changeFromIndex] = array[changeToIndex];
        array[changeToIndex] = temp;
    }
}
