package FindCycle;

import java.util.HashSet;

public class SolutionAyse {
    public static class ListNode {
      int val;
      public ListNode next;
      public ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(2);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        System.out.println(hasCycle(node1));

    }
         public static boolean hasCycle(ListNode head) {
            HashSet<ListNode> hashSet = new HashSet<>();
            ListNode current = head;
            while (current!=null){
                if(!hashSet.add(current)) return true;
                current= current.next;
            }
            return false;
        }




}
