package Day_01_Review;

import java.util.ArrayList;

public class BigOExamples {
    public static void main(String[] args) {
        int n=100; //Data Size
        find0(n);//1
        find1(n);
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arr1.add(i);
        }
      //logComplexity(n);
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(binarySearchIterative(array, 12));

    }
   // Big -O Constant Time ==> constant means you don't have any time complexity
    public static void find0(int dataSize){ // it does not any relationship size of the data
        // it is not depending n value
        int numberOfIterations=0;
            System.out.println(dataSize);
            numberOfIterations+=1;
        System.out.println("number of iteration "+ numberOfIterations);

    }

    // O(n) Time Complexity
    public static void find1(int dataSize){
        System.out.println(dataSize);
        for (int i = 0; i < dataSize; i++) {
            int a=+1;
        }
    }

    // O(n^2) Time Complexity
    public static void find2(int dataSize){ // n*n = O(n^2)
        System.out.println(dataSize);
        for (int i = 0; i < dataSize; i++) {
            if (contains(i)) System.out.println(i+ ": True");
        }
    }

    public static boolean contains(int a){
        for (int i = 0; i < a; i++) {
            int b=+1;
        }
        return true;
    }


    // O(log n)

    public static void logComplexity(int dataSize){
        int numberOfOperations=0;
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < dataSize ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
    }

    public static int binarySearchIterative(int[] array, int data){
        int left=0;
        int right= array.length-1;
        int operations=0;
        while (left<=right){
            int middle= (left+right)/2;
            if(array[middle]==data) {
                System.out.println("number of operations in Bin Search is: " +operations);
                return middle;
               }
            if (data<array[middle]) right= middle-1;
            else left=middle+1;
            operations++;
        }
        return -1;
    }
}
