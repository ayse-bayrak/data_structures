package Trees_Part2_Review;

public class TestTree2App {
    public static void main(String[] args) {
        MyTree2 tree = new MyTree2();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
//        System.out.println(tree.contains(5)); // true
//        System.out.println();
//        MyTree2 tree2 = new MyTree2();
//        tree2.printLeaves(tree.root);
//        System.out.println();
//
//        System.out.println("Height of root is "+ tree2.height(tree.root));
//
//        System.out.println("sum of nodes in tree: "+ tree2.sumOfNodes(tree.root));
//        System.out.println("Number of the leaves: " + tree2.countLeaves(tree.root));
//        System.out.println("sum of leaves is: " + tree2.findSumOfLeaves(tree.root));
//        System.out.println("sum of the nodes with helper " + tree.calculateNodeSums());

        System.out.println("level order traversal");
        tree.levelOrderTraversal();
    }

}
