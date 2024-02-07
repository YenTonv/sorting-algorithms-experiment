package experiment;

import org.junit.jupiter.api.Test;
import sortingalgorithms.ArrayGenerator;
import sortingalgorithms.ArrayGeneratorInterface;
import sortingalgorithms.SortInterface;
import sortingalgorithms.SortingAlgorithms;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmsTimes {

    public void mergeSortTests() {
        String sort = "MergeSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.mergeSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.mergeSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.mergeSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.mergeSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.mergeSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void insertionSortTests() {
        String sort = "InsertionSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.insertionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.insertionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.insertionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.insertionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.insertionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void selectionSortTests() {
        String sort = "SelectionSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.selectionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.selectionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.selectionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.selectionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.selectionSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void bubbleSortTests() {
        String sort = "BubbleSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bubbleSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bubbleSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bubbleSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bubbleSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bubbleSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void shellSortTests() {
        String sort = "ShellSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.shellSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.shellSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.shellSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.shellSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.shellSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void heapSortTests() {
        String sort = "HeapSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.heapSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.heapSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.heapSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.heapSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.heapSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void countingSortTests() {
        String sort = "CountingSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.countingSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.countingSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.countingSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.countingSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.countingSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void bucketSortTests() {
        String sort = "BucketSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bucketSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bucketSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bucketSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bucketSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.bucketSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void radixSortTests() {
        String sort = "RadixSort";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.radixSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.radixSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.radixSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.radixSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.radixSort(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void quickSortFirstTests() {
        String sort = "QuickSortFirst";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortFirst(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortFirst(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortFirst(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortFirst(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortFirst(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void quickSortRandomTests() {
        String sort = "QuickSortRandom";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortRandom(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortRandom(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortRandom(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortRandom(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortRandom(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }
    public void quickSortMedianTests() {
        String sort = "QuickSortMedian";
        ArrayGeneratorInterface ag = new ArrayGenerator();
        SortingAlgorithms sa = new SortingAlgorithms();
        int[] testArray;
        long start;
        long dur;
        StringBuilder line;

        //System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        for (int i = 2; i < 16; i++) {
            line = new StringBuilder(sort + ',' + (int)Math.pow(2,i) + ',');
            testArray = ag.generateRandomArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortMedian(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateReverseOrderArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortMedian(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortMedian(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateFiftyPercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortMedian(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);
            line.append(',');

            testArray = ag.generateSeventyFivePercentOrderedArray((int)Math.pow(2,i));
            start = System.nanoTime();
            sa.quickSortMedian(testArray);
            dur = System.nanoTime() - start;
            line.append(dur);

            System.out.println(line);

        }
    }

}