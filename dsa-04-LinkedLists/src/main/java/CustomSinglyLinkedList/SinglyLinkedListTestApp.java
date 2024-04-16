package CustomSinglyLinkedList;

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

        System.out.println(myList.getKthItemFromLast1(1));
    }
}
