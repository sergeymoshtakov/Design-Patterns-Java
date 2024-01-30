public class Main {
    public static void main(String[] args) {
        int[] array = {15, 6, 1, 8, 2, 9, 3, 4, 2, 10, 3};
        Strategy sortingAlgorithm = new BubbleSortStrategy();
        Context context = new Context();
        context.setArray(array);
        context.setSortingAlgorithm(sortingAlgorithm);
        context.sortArray();
    }
}