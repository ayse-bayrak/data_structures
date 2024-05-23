import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionsQueueTasks {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //I picked up Deque interface and
        // implementation of this interface is the ArrayDeque, it is the concrete class
        //Deque is stands for `double ended queue`, is usually pronounced 'deck'
        // this structure can behave as a Stack and as a Queue

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("John");
        pq.add("Michael");
        pq.add("Carol");
        System.out.println(pq.peek()); // Carol -- ordered --> alphabetical order
        System.out.println(pq.remove()); //Carol
        System.out.println(pq.remove()); //John
        System.out.println(pq.remove()); //Michael
    }
}
