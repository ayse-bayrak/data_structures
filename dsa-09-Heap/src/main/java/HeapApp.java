public class HeapApp {
    public static void main(String[] args) {
//        MyHeap heap=new MyHeap(10);
//        heap.insert(61);
//        heap.insert(120);
//        heap.insert(52);
//        System.out.println("Heap values after inserting 52");
//        heap.printHeap();
//        heap.insert(45);
//        System.out.println("Heap values after inserting 45");
//        heap.printHeap();
//        heap.insert(81);
//        System.out.println("Heap values after inserting 81");
//        heap.printHeap();
//        heap.remove();
//        System.out.println("Heap values after removing");
//        heap.printHeap();
//        heap.insert(130);
//        heap.printHeap();
//        heap.remove();
//        heap.printHeap();
        int[] numbers={1,2,13,5,35,6,8,21,0};
        MyHeap heap=new MyHeap(numbers);
        heap.printHeap();

    }

}
