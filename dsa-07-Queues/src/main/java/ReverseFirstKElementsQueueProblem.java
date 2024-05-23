import java.util.*;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {
        Queue<Integer> deque = new LinkedList<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        int k=4;
        System.out.println(reverseK(deque,k));

        //-------------------
//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//
//        reverseFirstK(queue, k);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

    }

   public static Queue<Integer> reverseK(Queue<Integer> deque, int k) {
      // Deque<Integer> stack = new ArrayDeque<>();
       int size = deque.size();
       Stack<Integer> stack = new Stack<>();
       for (int i = 0; i < k; i++) {
           stack.push(deque.remove());
       }
       Integer d = deque.remove();

       for (int i = 0; i < k; i++) {
           deque.add(stack.pop());
       }
       deque.add(d);
       return deque;
   }

   public static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        int size = queue.size;
       for (int i = 0; i < k ; i++) {
           stack.push(queue.dequeue());
       }
       for (int i = 0; i < k; i++) {
           queue.enqueue(stack.pop());
       }
       return queue;
   }

}
