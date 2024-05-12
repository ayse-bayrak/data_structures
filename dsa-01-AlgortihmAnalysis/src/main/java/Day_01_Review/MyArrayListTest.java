package Day_01_Review;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        int[] array=new int[10];
        int a= array.length;
        //we have array length, don't have the size. because in the array you occupy the length
        //it does not matter if you have some elements empty and some elements are occupied with data

        ArrayList<Integer> b=new ArrayList<>();
        // in the arraylist we have size, size is the number of elements that are inserted into Arraylist


     MyArrayList list1=new MyArrayList(5);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1.size());//arraylist
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.numbers.length);//array
    }
}
