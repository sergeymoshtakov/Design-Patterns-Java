public class QuickSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        QuickSort(arr, 0, arr.length);
    }

    public void QuickSort(int[] a, int beg, int end){
        if(beg < end){
            int m = (beg + end) / 2;
            partition(a, beg, end);
            QuickSort(a, beg, m);
            QuickSort(a, m, end);
        }
    }

    private void partition(int[] a, int beg, int end){
        int i = beg, j = end, x = a[(beg+end)/2];
        while(i <= j){
            while(a[i] <= x) {
                i++;
            }
            while(a[j] >= i) {
                j--;
            }
            if(i <= j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j++;
            }
        }
    }
}
