package AssignmentCustomSinglyLinkedList;

public class SinglyLinkedListTestApp {
    public static void main(String[] args) {

        MySinglyLinkedListAssignment myList = new MySinglyLinkedListAssignment();
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.printNodes();// 1-3-4-null
        myList.deleteByValue(4);
        myList.printNodes(); // 1-3-null
        System.out.println();
        System.out.println(myList.size);

        System.out.println(myList.indexOf(4));//-1
        System.out.println(myList.indexOf(1));//0

        myList.printNodes();//1=> 3 => null
        myList.addFirst(0);
        myList.printNodes();//0=> 1=> 3 => null

        // for test kthElementFrom the last and removeKthElementFrom
        System.out.println("Test kthElementFrom the last and removeKthElementFrom");
        MySinglyLinkedListAssignment myList1 = new MySinglyLinkedListAssignment();
        for (int i = 0; i < 10; i++) {
            myList1.add(i);
        }
        myList1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9 => null
        System.out.println("kth item from the last: " + myList1.getKthFromLast(3));//7
        myList1.removeKthFromLast(3);
        myList1.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9 => null

        System.out.println("Test removeKthFromLast2");
        MySinglyLinkedListAssignment myList2 = new MySinglyLinkedListAssignment();
        for (int i = 0; i < 10; i++) {
            myList2.add(i);
        }
        myList2.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 7=> 8=> 9 => null
        System.out.println("kth item from the last: " + myList2.getKthFromLast(3));//7
        myList2.removeKthFromLast2(3);
        myList2.printNodes();//0=> 1=> 2=> 3=> 4=> 5=> 6=> 8=> 9 => null

    }
}
