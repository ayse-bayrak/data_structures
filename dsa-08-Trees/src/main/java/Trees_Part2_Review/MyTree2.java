package Trees_Part2_Review;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree2 {
    TNode root;

    public MyTree2() {
        this.root = null;
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {

                if (current.leftChild == null) {
                    // if left is null insert there!!!
                    current.leftChild = newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    // if right is null insert there!!!
                    current.rightChild = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.rightChild;
            }
        }
    }

    // PreOrder Traversal of the tree
    // Root-Left-right
    void preOrderTraversal(TNode root) {
        if (root == null) return;// termination
        System.out.print(root.value + ", "); // visit root
        preOrderTraversal(root.leftChild);  // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }

    void inOrderTraversal(TNode root) {
        if (root == null) return; // termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root) {
        if (root == null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value + ", ");  // visit root
    }

    void levelOrderTraversal() {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }


    // Tree-2 Review Tasks Solutions

    // Task 1: Implement finding an integer value in a BST (Binary Search Tree).
    public boolean contains(int value) {
        // root is null -> return false
        if (root == null) return false;
        // current -> root
        TNode current = root;
        // while current is not null loop
        while (current != null) {
            // compare value and current.value
            // if less, branch left
            if (value < current.value) current = current.leftChild;
            // else if greater, branch right
            else if (value > current.value) current = current.rightChild;
            //else means equal and you find it return true
            else return true;
        }
        return false;
    }

    // Task 2: Implement a method that returns true if the node is a leaf in a BST.
    public boolean isLeaf(TNode node) { // leaf means no child
        // if the right and left of node == null it is a leaf
        return node.leftChild == null && node.rightChild == null;
    }

    // Task 3: Implement a method that prints leaves of a BST.
    public void printLeaves(TNode root) {
        if (root == null) return; // base condition, termination for the recursive
        // post traversal - l - r - root
        printLeaves(root.leftChild); // left
        printLeaves(root.rightChild); // right
        if (isLeaf(root)) System.out.print(root.value + ", "); // root
    }

    // Task 4: Implement a method that calculates height of a Node of a BST.
    int height(TNode root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
        //+1 beacuse we starting from 0
        // each step add value to sum variable
    }

    //Task 4.5 : Implement a method that calculates the sum of node values
    int sumOfNodes(TNode root) {
        if (root == null) return 0; // base condition
        return root.value + sumOfNodes(root.leftChild) + sumOfNodes(root.rightChild);
    }

    // Task 5: Implement a method that counts leaves of a BST.
    int countLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    // Task 6: Implement a method that returns sum of leaf values of a BST.
    int findSumOfLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }


    // Task 7: Implement a method that returns sum of Node values of a BST.
    public int calculateNodeSums() {
        return nodeSums(root);
    }

    public int nodeSums(TNode root) {
        if (root == null) return 0;
        return root.value + nodeSums(root.rightChild) + nodeSums(root.leftChild);
    }
    // Sum of all Nodes
    // why we need helper method
    // because encapsulate the root when we make private TreeNode root...

}
