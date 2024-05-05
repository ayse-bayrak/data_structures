package StacksReview;

public class FastStackTestApp {
    public static void main(String[] args) {
        FastStack<Integer> newStack = new FastStack<>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        System.out.println(newStack.pop()); //3
        newStack.push(5);
        System.out.println(newStack.pop()); //5
    }
}
