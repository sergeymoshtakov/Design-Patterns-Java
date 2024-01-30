public class Context {
    private Strategy sortingAlgorithm;
    private int[] array;

    public void setSortingAlgorithm(Strategy sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public Strategy getSortingAlgorithm(){
        return sortingAlgorithm;
    }

    public void setArray(int[] array){
        this.array = new int[array.length];
        for(int i = 0; i < array.length; i++){
            this.array[i] = array[i];
        }
    }

    public int[] getArray(){
        return array;
    }

    public void sortArray(){
        sortingAlgorithm.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
