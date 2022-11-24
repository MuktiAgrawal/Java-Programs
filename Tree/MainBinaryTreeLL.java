public class MainBinaryTreeLL {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree=new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        //System.out.println("Inorder");
        // binaryTree.inorder(N1);
        // System.out.println("Postorder");
        // binaryTree.postOrder(N1);
        // binaryTree.levelOrder();
        // binaryTree.searchBinaryNode("N1");
        System.out.println(binaryTree.getDeepestNode().value);
        binaryTree.deleteDeepestNode();
        binaryTree.levelOrder();
        // binaryTree.deleteNode("N2");
        // binaryTree.levelOrder();
        binaryTree.deleteBinaryTree();
        binaryTree.levelOrder();
    }
}
