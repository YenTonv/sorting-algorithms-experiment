package sortingalgorithms;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithms implements SortInterface {

    public SortingAlgorithms(){

    }
    @Override
    public void insertionSort(int[] array) {
        int current;
        int j;

        for (int i = 1; i < array.length; i++) {
            current = array[i];

            j = i;
            while (j >= 1 && current < array[j-1]) {
                array[j] = array[--j];
            }
            array[j] = current;
        }
    }

    @Override
    public void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            // set up the smallest
            int smallest = array[j];
            int sp = j;

            // for each number, run through the array to find the smallest number
            // if there is, set it as the smallest number
            for (int i = j; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    sp = i;
                }
            }
            //swap the smallest number to the current so the array length won't change
            int temp = array[j];
            array[j] = smallest;
            array[sp] = temp;
        }
    }

    @Override
    public void bubbleSort(int[] array) {
        boolean sorted;
        for (int j = 0; j < array.length; j++) {
            sorted = true;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            if (sorted == true)
                break;
        }
    }

    @Override
    public void shellSort(int[] array) {
        int[] gapArray = {701,301,132,57,23,10,4,1};
        for (int gap : gapArray){
            for(int i = gap; i < array.length; i += 1){
                int temp = array[i];
                int j = 0;
                for(j = i; (j >= gap) && (array[j - gap] > temp); j -= gap){
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    @Override
    public void mergeSort(int[] array) {
        int[] a1 = mergeSort(array, 0, array.length - 1);
        System.arraycopy(a1,0, array, 0, array.length);
    }

    private int[] mergeSort(int[] array, int start, int end) {
        // base case
        if (start == end) {
            return new int[]{array[start]};
        // recursive case
        } else {
            int mid = (start + end) / 2;

            int[] s1 = mergeSort(array, start, mid);
            int[] s2 = mergeSort(array, mid + 1, end);

            return(merge(s1, s2));
        }
    }

    private int[] merge(int[] array1, int[] array2) {
        int ptr1 = 0;
        int ptr2 = 0;

        int[] merged = new int[array1.length + array2.length];

        while (ptr1 < array1.length && ptr2 < array2.length) {
            if (array1[ptr1] <= array2[ptr2]) {
                merged[ptr1 + ptr2] = array1[ptr1++];
            } else {
                merged[ptr1 + ptr2] = array2[ptr2++];
            }
        }

        while (ptr1 < array1.length) {
            merged[ptr1 + ptr2] = array1[ptr1++];
        }
        while (ptr2 < array2.length) {
            merged[ptr1 + ptr2] = array2[ptr2++];
        }
        return merged;
    }

    @Override
    public void quickSort(int[] array) {
        QuickSort sort = new QuickSort();
        sort.QuickSortMedianOfThree(array);
    }

    public void quickSortFirst(int[] array) {
        QuickSort sort = new QuickSort();
        sort.QuickSortFirstElement(array);
    }
    public void quickSortRandom(int[] array) {
        QuickSort sort = new QuickSort();
        sort.QuickSortRandomElement(array);
    }
    public void quickSortMedian(int[] array) {
        QuickSort sort = new QuickSort();
        sort.QuickSortMedianOfThree(array);
    }

    @Override
    public void heapSort(int[] array) {

        for (int i = array.length; i > 0; i--) {
            buildHeap(array, i);
            swap(array, i - 1, 0);
        }

    }

    private void heapify(int[] array, int length, int root) {
        int largest = root;
        int l = left(root);
        int r = right(root);

        if (l < length && array[l] > array[largest]) largest = l;
        if (r < length && array[r] > array[largest]) largest = r;

        if (largest != root) {
            swap(array, root, largest);
            heapify(array, length, largest);
        }


    }

    private void buildHeap(int[] array, int length) {

        for (int i = parent(length - 1); i >= 0; i--) {
            heapify(array, length, i);
        }

    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    @Override
    public void countingSort(int[] array) {
        int[] toReturn = new int[array.length + 1];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        int[] count  = new int[max + 1];
        for(int i = 0; i < max; i++){
            count[i] = 0;
        }

        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }

        for(int i = 1; i <= max; i++){
            count[i] += count[i - 1];
        }

        for(int i = array.length - 1; i >= 0; i--){
            toReturn[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        for(int i = 0; i < array.length; i++){
            array[i] = toReturn[i];
        }

    }

    @Override
    public void bucketSort(int[] array) {
        //finding max of array
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>max) {
                max = array[i];
            }
        }

        //finding the max array value
        int maxArrayValue = 10;
        int n = max;
        while (n != 0) {
            n = max/maxArrayValue;
            if (n != 0) {
                maxArrayValue = maxArrayValue*10;
            }
        }

        //Creating empty buckets within an arraylist
        ArrayList<Integer>[] bucket = new ArrayList[array.length];
        for (int i = 0; i < array.length; i++){
            bucket[i] = new ArrayList<>();
        }
        // Add numbers into the buckets based on their value
        for (int i = 0; i < array.length; i++){
            int index = (array[i]*array.length)/maxArrayValue;
            bucket[index].add(array[i]);
        }

        //For each bucket, sort its elements
        for (int i = 0; i < array.length; i++){
            Collections.sort((bucket[i]));
        }

        //Get the sorted array
        int arrayIndex = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < bucket[i].size() ; j++){
                array[arrayIndex++] = bucket[i].get(j);
            }
        }
    }

    @Override
    public void radixSort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        int numDigits = findDigits(max);
        int digitToSort = 1;
        for(int i = 0; i < numDigits + 1; i++){
            countingSort(array,digitToSort);
            digitToSort*=10;
        }
    }

    public void countingSort(int[] array, int digit) {
        int[] toReturn = new int[array.length + 1];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            count[(array[i] / digit) % 10]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            toReturn[count[(array[i] / digit) % 10] - 1] = array[i];
            count[(array[i] / digit) % 10]--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = toReturn[i];
        }
    }

    private int findDigits(int num){
        if(num < 10){
            return 1;
        }
        return 1 + findDigits(num / 10);
    }
}