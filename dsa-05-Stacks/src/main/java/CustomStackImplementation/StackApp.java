package CustomStackImplementation;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }//0-1-2-3-4
        System.out.println(stack.peek());//4
        stack.popMine();// return void and without know to which one deleted,
        //I think we don't need to know deleted one
        System.out.println(stack.peek());//3
      stack.push(10);
      stack.push(11);
      stack.push(12);
      stack.push(13);

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop()); // return deleted one (top)
        }

        System.out.println("peek element (top) is: "+stack.peek());

    }
}
