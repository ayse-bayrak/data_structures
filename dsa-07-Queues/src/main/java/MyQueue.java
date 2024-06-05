import java.util.NoSuchElementException;

public class MyQueue <T>{
    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue() {
    }

    boolean isEmpty() {
        return front==null;
    }

    void enqueue(T item) {
        QNode<T> node = new QNode<>(item);
        if (isEmpty()) front=back=node;
        else {
            back.next = node;
            back=node;
        }
        size++;
    }

    T dequeue() {
        QNode<T> frontNode;//capture the deleting node, need to return value of removing Node
        if (isEmpty()) throw new NoSuchElementException();
        if (front==back) { // one element in the queue
            frontNode = front;
            front=back=null;
        } else {
            frontNode=front;
            front=front.next;
        }
        size--;
        return frontNode.value;
    }

    T peek() {
        return front.value;
    }

    int size() {
        return size;
    }

    //-enqueue -dequeue -peek -size -isEmpty

    void printQueue(){
        if (isEmpty()) return;
        QNode<T> current=front;
        while(current!=null) {
            System.out.print(current.value);
            if(current.next!=null) System.out.print(", ");
            current=current.next;
        }
    }
}
