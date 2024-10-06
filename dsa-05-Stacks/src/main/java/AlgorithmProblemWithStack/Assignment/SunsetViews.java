package AlgorithmProblemWithStack.Assignment;

import CustomStackImplementation.MyStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViewsStack(buildings,"East").forEach(System.out::println);
        System.out.println(sunsetViewsList(buildings, "East"));
        //Output [1, 3, 6, 7] // return indices of buildings!!!
    }

    public static ArrayList<Integer> sunsetViewsStack(int[] buildings, String direction) {
        MyStack<Integer> myStack = new MyStack<>();

        for (int i = 0; i < buildings.length; i++) {
            int value = buildings[i]; //3
            int temp=0;// to keep `the highest length` after the i
            int value2; // to keep high of each i
            for (int j = i+1; j < buildings.length; j++) {
                    value2 = buildings[j];
                if (value2>temp) temp=value2;
            }
            if (value>temp) myStack.push(i);//if length is greater than the highest length after the i, push to stack
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!myStack.isEmpty()) {
            arrayList.add(myStack.pop());
        }
        return arrayList;
    }

    public static ArrayList<Integer> sunsetViewsList(int[] buildings, String direction) {
        //  MyStack<Integer> myStack = new MyStack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            int value = buildings[i]; //3
            int temp=0;// to keep `the highest length` after the i
            int value2;
            for (int j = i+1; j < buildings.length; j++) {
                value2 = buildings[j];
                if (value2>temp) temp=value2;
            }
            if (value>temp) arrayList.add(i);//if length is greater than the highest length after the i, push to stack
        }

        return arrayList;
    }


}
