public class BubbleSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        BubbleSort(arr, arr.length);
    }

    private void BubbleSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j > i; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
