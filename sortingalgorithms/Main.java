package sortingalgorithms;

import java.util.Arrays;
import experiment.*;

public class Main {

    public static void main(String[] args) {
        SortingAlgorithmsTimes sat = new SortingAlgorithmsTimes();
        System.out.println("sort,size,random,reverse,ordered,50percent,75percent");
        sat.mergeSortTests();
        sat.heapSortTests();
        sat.insertionSortTests();
        sat.shellSortTests();
        sat.radixSortTests();
        sat.countingSortTests();
        sat.quickSortMedianTests();
        sat.selectionSortTests();
        sat.bucketSortTests();
        sat.bubbleSortTests();
        sat.quickSortFirstTests();
        sat.quickSortRandomTests();

    }


    /**
     * generates a random number between 0 and 40,000 inclusive
     * @return a number 0-40,000
     */
    public static int generateRandomNumber(){
        int max = 40_000;
        int min = 0;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    /**
     * generates a random number between min and max inclusive
     * @param min the minimum allowable number
     * @param max the maximum allowable number
     * @return number between max and min
     */
    public static int generateRandomNumber(int min, int max){
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}
