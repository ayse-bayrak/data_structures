package AlgorithmProblemWithStack.Assignment;

import CustomStackImplementation.MyStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";

        System.out.println(sunsetViews(buildings, direction));

        //Output [1, 3, 6, 7] // return indices of buildings!!!
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        MyStack<Integer> myStack = new MyStack<>();

        for (int i = 0; i < buildings.length; i++) {
            int value= buildings[i]; //3
            int temp=0;
            int value2;
            for (int j = i+1; j < buildings.length; j++) {
                    value2 = buildings[j];
                if (value2>temp) temp=value2;
            }
            if (value>temp) myStack.push(i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!myStack.isEmpty()) {
            arrayList.add(myStack.pop());
        }
        return arrayList;
    }

    public class SunsetViewsOptimum {
        public static void main(String[] args) {
            int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
            sunsetViews(buildings,"West").forEach(System.out::println);
        }
        public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
            Stack<Integer> stack=new Stack<>();// stack to hold building indicies that can see sunset
            // this part is for East by default
            int i=0;
            int step=1;
            // this part is for west
            if(direction.equalsIgnoreCase("west")) {
                i= buildings.length-1;
                step=-1;
            }
            while(i>=0 && i< buildings.length) {

                while(!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                    stack.pop();
                }
                stack.push(i);
                i+=step;
            }
            // now I have a stack with the building indicies that can see sunset
            if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);

            return new ArrayList<Integer>(stack);
        }
    }
}
