public class Node {
    int id;
    Node next; // we define next object address, I need the same type of this class Node
    //next is a type of a class so it is a reference type so it can hold the addresses of other objects

    public Node(int id) {
        this.id = id;
    }
}
