package ReadyStackCollectionStackImplementation;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Deque<Integer> cStack = new LinkedList<>();// Deque is a very useful tool
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
        System.out.println(cStack.peek()); //3
        System.out.println(cStack.pop());
        System.out.println("peek is " + cStack.peek());//2

        // if you need a Stack structure please go with the Collections

        Stack<Integer> s = new Stack<>();
        //you can use like this, but in development environment deque is very common very usefully


    }
}
