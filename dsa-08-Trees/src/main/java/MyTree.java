import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode= new TNode(value);
    if(root==null) {
        root=newNode;
        return;
    }
    TNode current=root;
    while (true) {
        if (value<current.value) { // go to left part
            if (current.leftChild==null) {
                //if left is null insert there!!
                current.leftChild=newNode;
                break;
            }
            // if left is not null branch into left subtree!!!
            current=current.leftChild;
        } else { // go to right part
            if (current.rightChild==null) {
                //if right is null insert there!!
                current.rightChild=newNode;
                break;
            }
            // if right is not null branch into left subtree!!!
            current=current.rightChild;
        }
    }
    }
    //Two mains types of Traversals:
    //1-Breath First - Level Order
    //2-Depth First
    //Pre-Order Root L R
    //In-Order L Root R
    //Post-Order L R Root

    //Root L R
    void preOrderTraversal(TNode root) {
        if(root==null) return; // termination-base condition
        System.out.print(root.value+", "); // visit root
        preOrderTraversal(root.leftChild); // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }

    //L Root R
    void inOrderTraversal(TNode root) {
        if(root==null) return; // termination-base condition
        // always remind-->recursive algorithm is to define the termination or base condition that will stop the algorithm
        inOrderTraversal(root.leftChild); // visit left subtree
        System.out.print(root.value+", "); // visit root
        inOrderTraversal(root.rightChild); // visit right subtree
    }

    // L R Root --last element is gonna be  Root
    void postOrderTraversal(TNode root) {
        if(root==null) return; // termination-base condition
        // always remind-->recursive algorithm is to define the termination or base condition that will stop the algorithm
        postOrderTraversal(root.leftChild); // visit left subtree
        inOrderTraversal(root.rightChild); // visit right subtree
        System.out.print(root.value+", "); // visit root
    }
//this part was recursive
    void levelOrderTraversal(TNode root) { // this time it will not be recursive
        if(root==null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { // Q not empty do
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }

    }
}
