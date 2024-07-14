public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) { // i=1 because j will be i-1--> assign to predecessor
            // we assume that the first element is already sorted
            int toBeInserted=array[i]; // temp var toBeInserted
            int j=i-1;// this is predecessor
            // start shifting operation here
            while(j>=0 && toBeInserted<array[j]){  // this is a pattern for shifthing you can use different algorithm, you keep the temporary one index and others shifting
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=toBeInserted;
        }
        return array;
    }
}
