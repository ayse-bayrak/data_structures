import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> set = new HashSet<>();
        // 2. add element
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));

        System.out.println(set);
        System.out.println(set.add(new Student(4, "Mary"))); //false, non duplicated so can not be added

        String str = "Java Developer";
        System.out.println(firstRepeatingChar(str));
    }

    public static Character firstRepeatingChar(String str) {
        //Time complexity? O(n)
        // create a hashSet
        Set<Character> set1 = new HashSet<>(); // in here I have Space Complexity of O(n)
        // Space complexity additional space required to accomplish this solution 
        // iterate over the char array and add chars into HashSet

        // This
        for(Character ch:str.toCharArray())
            if(!set1.add(ch)) return ch;
        // if add ops is false return that char
        return null;
    }
}
