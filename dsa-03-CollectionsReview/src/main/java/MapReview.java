import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapReview {
    public static void main(String[] args) {
        //create hash map

        Map<Integer,String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String st = "Java Developer";

        System.out.println(findFirstNonRepeating(st));
        //How to get values stored in the map in a asc sorted order?
        //List<String> list=studentsMap.values().stream().sorted((o1, o2)-> o1.compareToIgnoreCase(o2))
        //  .collect(Collectors.toList());
        List<String> list=studentsMap.values().stream().sorted(String::compareToIgnoreCase)
                .toList();

    }

    public static Character findFirstNonRepeating(String string){

        //create a map: this will cost me space complexity (because ther is not my structure in the beginning)
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
       // string = string.trim(); trim() does not remove spaces between words
        string = string.replace(" ", "");
        for (Character ch :string.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, count+1);
            } else {
                map.put(ch,1); // this is the first time i see the character
            }
        }

        // start from the beginning and check if there is a char with frequency 1
        for (Character ch :string.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }
        return null;
    }

}
