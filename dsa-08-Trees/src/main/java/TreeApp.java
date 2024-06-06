public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, true);
        System.out.println("Pre-Order Traversal of the Tree");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In-Order Traversal of the Tree");
        tree.inOrderTraversal(tree.root);//4, 5, 6, 8, 9, 10, 17, 20, 29, 42, 47
        // in in order Traversal the output is ascending order
        System.out.println();
        System.out.println("Post-Order Traversal of the Tree");
        tree.postOrderTraversal(tree.root);//5, 4, 8, 9, 6, 17, 20, 29, 42, 47, 10

        System.out.println();
        System.out.print("Level-Order Traversal of the Tree");
        System.out.println();
        tree.levelOrderTraversal(tree.root);
    }
}
