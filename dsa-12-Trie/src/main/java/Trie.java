import java.util.HashMap;
import java.util.Map;

public class Trie {

    // like every tree I need a root. this root should be trie
    TrieNode root;

    // Construct an empty Trie Object
    public Trie() {
    root= new TrieNode();
    }

    // Insert a new word into trie
    public void insert(String word) {  // for example "apple"
    TrieNode curNode = root;
    char[] arr = word.toCharArray();
        for (char c : arr) {
            if(!curNode.children.containsKey(c)) {  // hashMap
              curNode.children.put(c, new TrieNode());
            }
            curNode=curNode.children.get(c);
        }
        curNode.isWord=true;
    }

    public boolean search(String word) {
        TrieNode curNode = root;
        for (char c : word.toCharArray()) {
           if(!curNode.children.containsKey(c)) return false;

            curNode=curNode.children.get(c);// how can I move forward, with this
        }
        return curNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curNode = root;
        for (char c : prefix.toCharArray()) {
            if(!curNode.children.containsKey(c)) return false;
            curNode=curNode.children.get(c);// move to next node/child, how can I move forward, with this
        }
        return true;
    }
    class TrieNode {

        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false; // this means that if I am iterating over the trie
    }
}
