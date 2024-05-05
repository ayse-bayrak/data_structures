package StacksReview;

public class FastStack <T>{
    MySinglyLinkedList<T> list;

    public FastStack() {
        this.list = new MySinglyLinkedList<>();
    }

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


