package sortingalgorithms;

public interface ArrayGeneratorInterface {

    /**
     * generates an array populated by random integers
     * @param size the length of the array
     * @return the array of integers
     */
    public int[] generateRandomArray(int size);

    /**
     * generates an array populated by random integers, reverse sorted
     * @param size the length of the array
     * @return the array of integers
     */
    public int[] generateReverseOrderArray(int size);

    /**
     * generates a sorted array of by random integers
     * @param size the length of the array
     * @return the array of integers
     */
    public int[] generateOrderedArray(int size);

    /**
     * generates an array of random integers that is 50% sorted
     * @param size the length of the array
     * @return the array of integers
     */
    public int[] generateFiftyPercentOrderedArray(int size);

    /**
     * generates an array populated by random integers that is 75% sorted
     * @param size the length of the array
     * @return the array of integers
     */
    public int[] generateSeventyFivePercentOrderedArray(int size);
}
