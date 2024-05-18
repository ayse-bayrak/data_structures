package MergeTwoSortedLL;

public class FirstSolution {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static void main(String[] args) {
   ListNode node1= new ListNode(1);
   ListNode node2= new ListNode(2);
   ListNode node3= new ListNode(3);
   ListNode node4= new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        ListNode node11= new ListNode(5);
        ListNode node22= new ListNode(6);
        ListNode node33= new ListNode(7);
        ListNode node44= new ListNode(8);
        node11.next=node22;
        node22.next=node33;
        node33.next=node44;

        ListNode list3=mergeTwoLists(node1, node11);

        while (list3!=null) {
            System.out.print(list3.val+ "-->");
            list3=list3.next;
        }
        System.out.print("null");
    }
    public static ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {
        ListNode tempHead= new ListNode();
        ListNode prev = tempHead;
        while (curr1!=null && curr2!=null){
            if (curr1.val<=curr2.val) {
                prev.next=curr1;
                curr1=curr1.next;
            } else {
                prev.next=curr2;
                curr2= curr2.next;
            }
            prev=prev.next;
        }
        if (curr1==null) prev.next=curr2;
        else prev.next=curr1;
        return tempHead.next;
    }
}
