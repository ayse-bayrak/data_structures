package CustomStackImplementation;

import java.util.NoSuchElementException;

public class MyStack<T> {
    public SNode<T> bottom; // like head
    public SNode<T> top; // like tail
    int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T item) {
        SNode<T> node = new SNode<>(item);
        if (isEmpty()) bottom = top = node; // case 1
        else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() { // it will return value of the top without removing it
        return (T) top.value; // i need to cast this into T
    }

    public T pop() { // pop is deletion operation with remove it
        SNode peekNode;
        //public MyStackImplementation.SNode<T> bottom;
        if (isEmpty()) throw new NoSuchElementException();
        // I need to cover different cases
        //case 1 - stack has one element
        if (top == bottom) {
            peekNode = top;// we need to peek to display top (peekNode)
            top = bottom = null; // deletion operation
        } else { // case 2-stack has more than one element
            peekNode = top;
            SNode prev = bottom; // to remove the top item I need to know prev one, and for this i iterate from  bottom until prev.next=null
            while (prev.next != top) { // to find prev element if top
                prev = prev.next;
            }
            prev.next = null; //deletion top item, now, prev is before the top
            top = prev;
        }
        size--;
        return (T) peekNode.value;

    }

    public void popMine() { // pop is deletion operation with remove it

        //public MyStackImplementation.SNode<T> bottom;
        if (isEmpty()) throw new NoSuchElementException();
        // I need to cover different cases
        //case 1 - stack has one element
        if (top == bottom) {
            top = bottom = null; // deletion operation
        } else { // case 2-stack has more than one element
            SNode prev = bottom; // to remove the top item I need to know prev one, and for this i iterate from  bottom until prev.next=null
            while (prev.next != top) { // to find prev element if top
                prev = prev.next;
            }
            prev.next = null; //deletion top item, now, prev is before the top
            top = prev;
        }
        size--;
    }

}
