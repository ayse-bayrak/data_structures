import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        //create hash map

        Map<Integer,String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String st = "Java Developer";

        System.out.println(findFirstNonRepeating(st));

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
