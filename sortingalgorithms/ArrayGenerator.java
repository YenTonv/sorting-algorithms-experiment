package sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Comparator.reverseOrder;

public class ArrayGenerator implements ArrayGeneratorInterface{

    public ArrayGenerator(){}

    @Override
    public int[] generateRandomArray(int size) {
        int[] toReturn = new int[size];
        for(int i = 0; i < size; i ++){
            toReturn[i] = Main.generateRandomNumber();
        }
        return toReturn;
    }

    @Override
    public int[] generateReverseOrderArray(int size) {
        int[] toReturn = new int[size];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < size; i ++){
            temp.add(Main.generateRandomNumber());
        }
        Collections.sort(temp,reverseOrder());
        for(int i = 0; i < size; i++){
            toReturn[i] = temp.get(i);
        }
        return toReturn;
    }

    @Override
    public int[] generateOrderedArray(int size) {
        int[] toReturn = new int[size];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < size; i ++){
            temp.add(Main.generateRandomNumber());
        }
        Collections.sort(temp);
        for(int i = 0; i < size; i++){
            toReturn[i] = temp.get(i);
        }
        return toReturn;
    }

    @Override
    public int[] generateFiftyPercentOrderedArray(int size) {
        int[] toReturn = new int[size];
        ArrayList<Integer> temp = new ArrayList<>();
        int half = size/2;
        for(int i = 0; i < half; i ++){
            temp.add(Main.generateRandomNumber(0,19_999));
        }
        Collections.sort(temp);
        for(int i = 0; i < size; i++){
            if(i < half){
                toReturn[i] = temp.get(i);
            }
            else{
                toReturn[i] = Main.generateRandomNumber(20_000,40_000);
            }
        }
        return toReturn;
    }

    @Override
    public int[] generateSeventyFivePercentOrderedArray(int size) {
        int[] toReturn = new int[size];
        ArrayList<Integer> temp = new ArrayList<>();
        int threeQuarter = 3*((size/2)/2);
        for(int i = 0; i < threeQuarter; i ++){
            temp.add(Main.generateRandomNumber(0,29_999));
        }
        Collections.sort(temp);
        for(int i = 0; i < size; i++){
            if(i < threeQuarter){
                toReturn[i] = temp.get(i);
            }
            else{
                toReturn[i] = Main.generateRandomNumber(30_000,40_000);
            }
        }
        return toReturn;
    }
}
