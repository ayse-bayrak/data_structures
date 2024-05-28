package queue_hashmap_review;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode706_DesignHashMap {
 // merge all class related with MyHashMap

class MyHashMap{

    List<BucketLinkedList> list;
    public int modNumber;

    public MyHashMap() {
        this.modNumber=2003;
        this.list= new ArrayList<BucketLinkedList>();
        for (int i = 0; i < 2003; i++) {
            this.list.add(new BucketLinkedList());
        }
    }

    public void put(int key, int value) {
        //calculate index from the key with modulus
        int index = key % modNumber;
        list.get(index).put(key, value);
    }

    public int get(int key) {
        // calculate index with module go and visit the slots
        // and then get the value associated with this in the link list.
        int index = key %modNumber;
        return list.get(index).get(key);
    }

    public void remove(int key) {
        int index = key %modNumber;
        list.get(index).remove(key);
    }

    public class KeyValue <U, V>{
        U key;
        V value;

        public KeyValue(U key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public class BucketLinkedList {
        LinkedList<KeyValue<Integer, Integer>> bucketList;

        public BucketLinkedList() {
            this.bucketList = new LinkedList<KeyValue<Integer, Integer>>();
        }

        public int get(int key){
            //Basic search with a loop return value if key matches
            for (KeyValue<Integer, Integer> pair : bucketList){
                if(pair.key.equals(key)) return pair.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            // if there is match update value
            for (KeyValue<Integer, Integer> pair : bucketList){
                if(pair.key.equals(key)) {
                    pair.value=value;
                    return;
                }
            }
            //if no match add it
            this.bucketList.add(new KeyValue<>(key, value));
        }

        public void remove (int key){
            for (KeyValue<Integer, Integer> pair : bucketList){
                if(pair.key.equals(key)) {
                    // if there is a match remove that pair
                    this.bucketList.remove(pair);
                    return;
                }
            }
        }

    }

}

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

