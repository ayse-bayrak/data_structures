public class ExponentialSearch {
    public static int exponentialSearch(int[] array, int data){
        int bound=1;
        // to skip the blocks that can not contain data
        while (bound<array.length && array[bound]<data) bound*=2;
        // found the suitable block make a binary search in that block
        int left=bound/2;
        int right=Math.min(bound, array.length-1);
        return BinarySearch.binarySearchRecursive(array, data, left,right);
    }
}
