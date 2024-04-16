import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Single Linked Lists-Example
        //How can we create Singly Linked List
        //1-Firstly we create a Node class and define int id and Node next variable,

        //2-and then create node objects
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        System.out.println(node1.next);//null
        // Next field will be null for unassigned reference types, it si not pointing the anything now

        //3-Link node objects
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Node1's address is: " + node1 + "Node1' next address is " + node1.next);
        System.out.println("Node2's address is: " + node2 + "Node2' next address is " + node2.next);
        System.out.println("Node3's address is: " + node3 + "Node3' next address is " + node3.next);
        System.out.println("Node4's address is: " + node4 + "Node4' next address is " + node4.next);

        //How can assign first element to LinkedList
        Node head = node1;
        System.out.println(head.id);//1
        System.out.println(head.next.id);//2
                         //node2.id
        System.out.println(head.next.next.id);//3
                            //node3.id

        // how can i iterate the LinkedList
        //1-I need a starting point (Address of the Head)
        // it has already done above
        //2-I need a dummy nod variable (current) // just like i index in a for loop
        Node current;
        //3-Assign head address to current (current = head)
        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current=current.next;
        }
        //The other recording
        Node head1 = node1;
        Node current1 = head1;
        while (current1!=null){
            System.out.println(current1.id);
            current1= current1.next;
        }
    }



}
