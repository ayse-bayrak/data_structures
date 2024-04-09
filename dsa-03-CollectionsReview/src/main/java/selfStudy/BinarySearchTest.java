package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        //           0  1  2  3  4  5  6  7
        int x=9;
        BinarySearch ob=new BinarySearch();
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }

        public int search(int[] nums, int target) {

            int l = 0;
            int r = nums.length-1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (nums[m] == target) {
                    return m;
                }
                if (target > nums[m]) {
                    l=m+1;
                }
                if (target<nums[m]){
                    r=m-1;
                }
            }
            return -1;
        }
}
