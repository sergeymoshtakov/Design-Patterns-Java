public class MergeSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        MergeSort(arr,0,  arr.length);
    }

    private void MergeSort(int[] arr, int beg, int end){
        int m = (beg + end)/2;
        MergeSort(arr, beg, m);
        MergeSort(arr, m, end);
        merge(arr, beg, m, end);
    }

    private void merge(int[] a, int beg, int m, int end){
        int[] b = new int[end - beg];
        int i = 0, j = beg, k = m;
        while (j != m || k != end) {
            if(j < m && (k == end || a[j] <= a[k])){
                b[i++] = a[j++];
            } else {
                b[i++] = a[k++];
            }
            while(i > 0) {
                i--;
                a[beg + i] = b[i];
            }
        }
    }
}
