import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoPointerSlowFast {
    public static void main(String[] args) {

        //To initialize a List in Java, there are different way

        //Using ArrayList
        List<Integer> list1 = new ArrayList<>(); // Initialize an empty ArrayList
        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "orange")); // Initialize with elements
        List<Integer> list11 = Arrays.asList(1,2,3,4,5,6,7);

        //Using LinkedList:
        List<Integer> list3 = new LinkedList<>(); // Initialize an empty LinkedList
        List<String> list4 = new LinkedList<>(Arrays.asList("apple", "banana", "orange")); // Initialize with elements

        //Using Arrays.asList():
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5); // Initialize with elements

        //Using List.of() (Java 9 and later):
        List<Integer> list6 = List.of(2, 4, 6, 8, 10); // Initialize with elements
        System.out.println(getKthElement1(list6, 2));
    }


    public static Integer getKthElement(List<Integer> list, int k) {
        int slow=0;
        int fast = list.size();
        while (slow<fast) {
            int middle = slow+(fast-slow)/2;
           if (middle==k-1) return list.get(middle);

           if (list.get(middle)< list.get(k-1)) slow=middle;
           else fast=middle;
        }
        return -1;
    }
    public static Integer getKthElement1(List<Integer> list, int k) {
        int slow=0;
        int fast = list.size()-1;
        while (fast > 0 && slow < list.size()) {
            if (slow==k-1) return list.get(slow);
            slow+=slow;
            if (fast==k-1) return list.get(fast);
            fast--;
        }
        return -1;
    }
}
