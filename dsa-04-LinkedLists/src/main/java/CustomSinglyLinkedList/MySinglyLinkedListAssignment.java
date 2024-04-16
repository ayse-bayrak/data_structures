package CustomSinglyLinkedList;

public class MySinglyLinkedListAssignment {
    Node head;
    Node tail;
    int size;
    //Methods
    boolean isEmpty() {
        return head==null;
    }

    void addFirst(int value){
        Node newNode= new Node(value);
        if (isEmpty()) {
            head=tail=newNode;
        } else {
            newNode.next = head;
            head=newNode;
        }
        size++;
    }
    // Add new elements after Tail
    void add(int value){
        //new node with this value
    Node newNode = new Node(value);
    if (isEmpty())
        head=tail=newNode;
    else{
        tail.next=newNode;
        tail=newNode;
    }
        size++;
    }

    //Delete by the Value of the Node
    void deleteByValue(int value) {
        // check if the list is empty
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node prev=head;
        Node current=head;
        while (current!=null){
            if (current.value==value) { // there is a match
                //there are three case
                //case 1:head
                if (current==head) {
                    head=current.next;
                    current.next=null;
                }
                //case 2:tail
                else if (current==tail){
                    tail=prev;
                    prev.next=null;
                }
                //case 3:middle
                else {
                    prev.next= current.next;
                    current.next=null;
                }
           size--;
            }
            prev=current;
            current=current.next;
        }


    }

    // method that returns the index
    int indexOf(int value) {

    if (isEmpty()) return -1;

    int pos=0;
    Node current = head;
    while (current!=null) {
        if (current.value==value) {
            return pos;
        }
        pos++;
        current=current.next;
    }
        return -1;
    }

    //Printing the node valu
    void printNodes(){
//Reset my current with the head of Linked List
        Node current=head;
        while (current!=null){
            if (current.next==null){
                System.out.println(current.value+ " => null");
            } else {
                System.out.print(current.value + "=> ");
            }
            current=current.next;
        }
    }

    public int getKthFromLast(int k){
        //create two pointers
        Node slow=head;
        Node fast=head;

        //move fast k-1 time
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        //move both pointer until fast hits the last element
        while (fast!=null) {
                fast=fast.next;
                slow=slow.next;
        }
        // ptr1 is on the kth element from the last
        return slow.value;
    }

    public int getKthItemFromLast1(int k){
        // create two pointers
        Node ptr1=head;
        Node ptr2=head;
        // move ptr2 k-1 times

        for (int i = 0; i < k-1; i++) {
            ptr2=ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while(ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.value;
    }
    public void removeKthFromLast(int k){
        //create two pointers
        Node slow=head;
        Node fast=head;
        Node prev=null;

        //move fast k-1 time
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        //move both pointer until fast hits the last element
        while (fast!=null) {
            prev=slow;
            fast=fast.next;
            slow=slow.next;
        }
        // ptr1 is on the kth element from the last

        // we find KthElementFromLast ==>slow

        //three case
        if (slow==head) {
            head=slow.next;
            slow.next=null;
            size--;
        }else if (slow==tail){
            tail=prev;
            prev.next=null;
          size--;
        }else {
            prev.next=slow.next;
            slow.next=null;
            size--;
        }

    }

}

