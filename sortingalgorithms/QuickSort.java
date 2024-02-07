package sortingalgorithms;
import java.util.*;

public class QuickSort {


    public QuickSort() {}

    public void QuickSortFirstElement(int[] arrayToBeSorted) {
        QuickSortFirstElement(arrayToBeSorted, 0, arrayToBeSorted.length - 1);
    }
    private void QuickSortFirstElement(int[] arrayToBeSorted, int start, int end) {
        int length = (end - start) + 1;
        if (length > 1) {
            int pivotIndex = firstElementPivot(start, end);
            int pivot = arrayToBeSorted[pivotIndex];
            swap(arrayToBeSorted, pivotIndex, end); //Swaps the pivot with the final number in the array
            int numOfSmallestSeen = 0;
            for (int i = start; i < end; i++) {
                if (arrayToBeSorted[i] <= pivot) {
                    swap(arrayToBeSorted, numOfSmallestSeen + start, i);
                    numOfSmallestSeen++;
                }
            }
            swap(arrayToBeSorted, numOfSmallestSeen + start, end);
            QuickSortFirstElement(arrayToBeSorted, start, start + (numOfSmallestSeen - 1));
            QuickSortFirstElement(arrayToBeSorted, start + (numOfSmallestSeen + 1), end);
        }
    }

    public void QuickSortRandomElement(int[] arrayToBeSorted) {
        QuickSortRandomElement(arrayToBeSorted, 0, arrayToBeSorted.length - 1);
    }

    public void QuickSortRandomElement(int[] arrayToBeSorted, int start, int end) {
        int length = (end - start) + 1;
        if (length > 1) {
            int pivotIndex = randomPivot(start, end);
            int pivot = arrayToBeSorted[pivotIndex];
            swap(arrayToBeSorted, pivotIndex, end); //Swaps the pivot with the final number in the array
            int numOfSmallestSeen = 0;
            for (int i = start; i < end; i++) {
                if (arrayToBeSorted[i] <= pivot) {
                    swap(arrayToBeSorted, numOfSmallestSeen + start, i);
                    numOfSmallestSeen++;
                }
            }
            swap(arrayToBeSorted, numOfSmallestSeen + start, end); //Swaps the pivot to it's correct place
            QuickSortFirstElement(arrayToBeSorted, start, start + (numOfSmallestSeen - 1));
            QuickSortFirstElement(arrayToBeSorted, start + (numOfSmallestSeen + 1), end);
        }
    }

    public void QuickSortMedianOfThree(int[] arrayToBeSorted) {
        Map<Integer, Integer> indexes = new TreeMap<>();
        QuickSortMedianOfThree(arrayToBeSorted, indexes, 0, arrayToBeSorted.length - 1);
    }

    public void QuickSortMedianOfThree(int[] arrayToBeSorted, Map<Integer, Integer> indexes, int start, int end) {
        int length = (end - start) + 1;
        if (length > 1) {
            int pivotIndex = medianOfThree(arrayToBeSorted, indexes, start, end);
            int pivot = arrayToBeSorted[pivotIndex];
            swap(arrayToBeSorted, pivotIndex, end); //Swaps the pivot with the final number in the array
            int numOfSmallestSeen = 0;
            for (int i = start; i < end; i++) {
                if (arrayToBeSorted[i] <= pivot) {
                    swap(arrayToBeSorted, numOfSmallestSeen + start, i);
                    numOfSmallestSeen++;
                }
            }
            swap(arrayToBeSorted, numOfSmallestSeen + start, end); //Swaps the pivot to it's correct place
            QuickSortFirstElement(arrayToBeSorted, start, start + (numOfSmallestSeen - 1));
            QuickSortFirstElement(arrayToBeSorted, start + (numOfSmallestSeen + 1), end);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];
        array[index1] = num2;
        array[index2] = num1;
    }

    private int firstElementPivot(int start, int end) {
        return start;
    }

    private int randomPivot(int start, int end) {
        Random r = new Random();
        return r.nextInt(start - end + 1) + start;
    }

    private int medianOfThree(int[] array, Map<Integer, Integer> indexes, int start, int end) {
        indexes.clear();
        int middle = start + ((end - start) / 2);
        indexes.put(array[start], start);
        indexes.put(array[end], end);
        indexes.put(array[middle], middle);
        int iterator = 0;
        for (Integer num : indexes.keySet()) {
            if (iterator == 1) {
                return indexes.get(num);
            }
            iterator++;
        }
        return -1;
    }

}
