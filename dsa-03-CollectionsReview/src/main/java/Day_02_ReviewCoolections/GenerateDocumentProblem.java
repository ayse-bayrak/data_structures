package Day_02_ReviewCoolections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GenerateDocumentProblem {
    public static void main(String[] args) {
        String list = "!veDJaCyd vaeo perelo xw";
        String document = "Cydeo Java Developer!";

        System.out.println(generateDocumentBruteForce(list, document));
        System.out.println(generateDocumentOptimal(list, document));
    }

    public static boolean generateDocumentBruteForce(String list, String document) {
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentCharFreq= countCharFreq(character, document);
            int charListFrequency = countCharFreq(character, list);
            if(documentCharFreq>charListFrequency) return false;
        }
        return true;
    }

    public static int countCharFreq(Character character, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character==str.charAt(i)) count++;
        }
        return count;
    }

    public static boolean generateDocumentOptimal(String list, String document) {
        // create hashMap (char, int)
        HashMap<Character, Integer> charCount = new HashMap<>();
        // iterate and count chars in the list
        for (int i = 0; i < list.length(); i++) {
            char character = list.charAt(i);
            charCount.put(character, charCount.getOrDefault(character, 0)+1); // very common using pattern to find frequency character of string
            //it is like if( !map.containskey(ch) ====>>>put(ch,1)
            //else define counter  map.get(ch) then put again ch, count+1
        }
        // iterate doc string and update char freq from hashMap
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if(!charCount.containsKey(character) || charCount.get(character)==0) return false;
            charCount.put(character, charCount.get(character)-1); // updated the count
        }
        // return true if prev loop is completed without false
        return true;
    }

    private static boolean canCreateDocument(String characters, String document){
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> docMap = new HashMap<>();

        for (char ch : characters.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch,0)+1);
        }
        for (char ch : document.toCharArray()) {
            docMap.put(ch, docMap.getOrDefault(ch,0)+1);
        }

        for (Character ch : docMap.keySet()) {
            if (charMap.getOrDefault(ch, 0)<docMap.get(ch)){
                return false;
            }
        }

        return true;


    }

}
