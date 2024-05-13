package StacksReview;

public class FastStack <T>{
    MySinglyLinkedList<T> list;

    public FastStack() {
        this.list = new MySinglyLinkedList<>();
    } // therefore I made an adaptor, (pattern) I have adopted my stack

    int size(){
        return list.size;
    }

    void push(T t) {
        list.addFirst(t);
    }
    T pop(){
        return list.removeFirst();
    }

}


