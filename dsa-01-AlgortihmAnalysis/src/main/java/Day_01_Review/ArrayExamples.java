package Day_01_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] array1= {2,4,6};
        int[] array2={1,3,5};
        System.out.println(Arrays.toString(array1));
        array1=array2;
        System.out.println(Arrays.toString(array1));
        ArrayList<Integer> a=new ArrayList<>();
    }
}
