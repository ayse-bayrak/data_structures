package PrintMiddleLL;


import java.util.Arrays;

public class PrintMiddleAyse {
    public static void main(String[] args) {
        Node head;
        Node tail;
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;

        System.out.println(Arrays.toString(printMiddle(node1)));

    }

    static int[] printMiddle (Node head) {
        Node tail=null;
        Node a;
        Node b;
        a=b=head;
        if (head.next==null) tail=head;
        while (a.next!=null) {
            if(a.next==null) tail=a.next;
            a=a.next;
        }//define tail
        a=b=head;
        while (b.next!=null&&b.next.next!=null ) {
            a=a.next;
            b=b.next.next;
            if (b==tail) return new int[] {a.id};
            else if (b.next==tail) return new int[] {a.id, a.next.id};
        }
        return new int[0];
    }
}
