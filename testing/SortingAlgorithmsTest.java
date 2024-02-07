package testing;

import org.junit.jupiter.api.Test;
import sortingalgorithms.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    //insertionSort tests
    @Test
    void insertionSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.insertionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void insertionSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.insertionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void insertionSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.insertionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void insertionSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.insertionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void insertionSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.insertionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //selectionSort tests
    @Test
    void selectionSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.selectionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void selectionSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.selectionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void selectionSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.selectionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void selectionSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.selectionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void selectionSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.selectionSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //bubbleSort tests
    @Test
    void bubbleSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bubbleSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bubbleSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bubbleSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bubbleSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bubbleSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bubbleSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bubbleSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bubbleSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bubbleSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //shellSort tests
    @Test
    void shellSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.shellSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void shellSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.shellSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void shellSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.shellSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void shellSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.shellSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void shellSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.shellSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //mergeSort tests
    @Test
    void mergeSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.mergeSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void mergeSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.mergeSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void mergeSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.mergeSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void mergeSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.mergeSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void mergeSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.mergeSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //quickSort tests
    @Test
    void quickSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.quickSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.quickSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.quickSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.quickSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void quickSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.quickSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //heapSort tests
    @Test
    void heapSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.heapSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void heapSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.heapSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void heapSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.heapSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void heapSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.heapSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void heapSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.heapSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //countingSort tests
    @Test
    void countingSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.countingSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void countingSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.countingSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void countingSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.countingSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void countingSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.countingSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void countingSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.countingSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //bucketSort tests
    @Test
    void bucketSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bucketSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bucketSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bucketSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bucketSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bucketSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bucketSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bucketSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void bucketSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.bucketSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }


    //radixSort tests
    @Test
    void radixSortRandomArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateRandomArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.radixSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void radixSortOrderedArray() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.generateOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.radixSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void radixSortReverseOrdered() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateReverseOrderArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.radixSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void radixSortFifty() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateFiftyPercentOrderedArray(25);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.radixSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }

    @Test
    void radixSortSeventyFive() {
        SortInterface test = new SortingAlgorithms();
        ArrayGeneratorInterface generator = new ArrayGenerator();
        int[] testArray = generator.
                generateSeventyFivePercentOrderedArray(20);
        int[] sortedArray = testArray.clone();
        Arrays.sort(sortedArray);
        test.radixSort(testArray);
        System.out.printf("expec. Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(sortedArray[i] + ", ");
        }
        System.out.println("]");
        System.out.printf("Actual Array: [ ");
        for(int i = 0; i < sortedArray.length; i++){
            System.out.printf(testArray[i] + ", ");
        }
        System.out.println("]");
        assertArrayEquals(testArray, sortedArray);
    }
}