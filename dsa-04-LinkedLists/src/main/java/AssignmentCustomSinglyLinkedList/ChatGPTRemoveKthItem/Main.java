package AssignmentCustomSinglyLinkedList.ChatGPTRemoveKthItem;

public class Main {
    public static ListNode removeKthFromEnd(ListNode head, int k) {
        if (head == null)
            return null;
        
        // Create a dummy node to handle edge cases where the head needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // Move fast pointer K+1 steps ahead
        for (int i = 0; i <= k; i++) {
            if (fast == null)
                return null; // or handle the case by returning head or throw an exception
            fast = fast.next;
        }
        
        // Move both pointers simultaneously until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Now slow points to the node just before the one to be removed
        slow.next = slow.next.next;
        
        return dummy.next; // Return the modified list
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Constructing a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2; // Deleting the 2nd item from the end (K = 2)
        head = removeKthFromEnd(head, k);
        printList(head); // Output after deletion: 1 2 3 5
    }
}
