package queue_hashmap_review;

import java.util.Arrays;

public class MyHashMap2 {

    int[] data;

    public MyHashMap2() {
        data = new int[1000001];
        Arrays.fill(data,-1);
    }

    public static void main(String[] args) {

        MyHashMap2 myHashMap2 = new MyHashMap2();
        System.out.println(Arrays.toString(myHashMap2.data));// fill all 1000000 index with -1

    }
    /*
    public static void fill(int[] a, int val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }
     */

    public void put(int key, int value) {
        data[key]=value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
}

