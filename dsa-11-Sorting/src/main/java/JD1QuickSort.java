public class JD1QuickSort {
    public static void qSort(int[] array, int start, int end){
       if (start>=end) return; //termination of QSort, only one element or zero
       int boundary=partition(array, start, end); // for pivot, boundary is last position of the pivot
      // recursively call left part
       qSort(array, start, boundary-1);// call qSort for left part
        // recursively call right part
       qSort(array,boundary+1, end);// call qSort for right part
    }

    public static int partition(int[] array, int start, int end){
        int pivot=array[end]; // last element as pivot
        int boundary=start;
        for (int i = start; i <=end ; i++) {
            if(array[i]<=pivot) swap(array, i, boundary++);
        }
        return boundary-1;
    }
    public static void swap(int[] array, int idx1, int idx2){
        int temp=array[idx1];
        array[idx1]=array[idx2];
        array[idx2]=temp;
    }
}
