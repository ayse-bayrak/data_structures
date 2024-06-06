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
}
