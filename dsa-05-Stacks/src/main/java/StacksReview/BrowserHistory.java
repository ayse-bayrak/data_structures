package StacksReview;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    // declare 2 stacks and current
    Deque<String> history, forwardStack;
    String currentPage;

    public BrowserHistory(String homepage) {
        // initialize stacks and current=homepage
        history=new ArrayDeque<>(); // ArrayDeque is one of the implementation of Deque
        forwardStack = new ArrayDeque<>();
        currentPage=homepage;
    }

    public void visit(String url) {
        // Push 'current' in 'history' stack and mark 'url' as 'current'.
        history.push(currentPage);
        currentPage=url;
        System.out.println(url + " is visited" );

        forwardStack=new ArrayDeque<>();// I need to assign new  forward step, clear forward

    }

    public String back(int steps) {
        int steps2=steps;
        while (steps>0 && !history.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage= history.pop();
            steps--;
        }
        System.out.println("Back operation of "+ steps2 + " bring " + currentPage);
      return currentPage;
    }

    public String forward(int steps) {
        int steps2=steps;
        while (steps>0 && !forwardStack.isEmpty()) {
            history.push(currentPage);
            currentPage= forwardStack.pop();
            steps--;
        }
        System.out.println("Forward operation of "+ steps2 + " bring " + currentPage);
        return currentPage;

    }
    // there is another solution in interview preparation with DLL

}
