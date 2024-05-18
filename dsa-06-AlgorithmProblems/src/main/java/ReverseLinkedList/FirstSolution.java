package ReverseLinkedList;

import static ReverseLinkedList.FirstSolution.Solution.reverseList;

public class FirstSolution {

 public static class ListNode {

     // it is not optimal solution but it is my first solution
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        ListNode result = reverseList(node1);

        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
        System.out.println(result.next.next.next.next.val);

    }  //leetcode 206. Reverse Linked List

    class Solution {
        public static ListNode reverseList(ListNode head) {
            ListNode current=head.next;
            ListNode prev=head;
            ListNode tail=head;

            while (current!=null){
                ListNode nextNode=current.next;
                current.next=prev;
                prev=current;
                current=nextNode;
            }
            head=prev;
            tail.next=null;
           return head;
        }
    }
}
