public class Main_BTArray {
    public static void main(String[] args) {
        BinaryTreeArray newBinaryTree=new BinaryTreeArray(7);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        System.out.println("Preorder:");
        newBinaryTree.preorder(1);
        System.out.println("\nInorder");
        newBinaryTree.inorder(1);
        System.out.println("\nPostorder");
        newBinaryTree.postorder(1);
    }
}
