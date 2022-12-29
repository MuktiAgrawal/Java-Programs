public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST=new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        System.out.println("Preorder");
        newBST.preOrder(newBST.root);
        System.out.println("\nInorder");
        newBST.InOrder(newBST.root);
        System.out.println("\nPostorder");
        newBST.PostOrder(newBST.root);
        System.out.println("\nLevelorder");
        newBST.levelOrder();
        // newBST.search(newBST.root,450);
        newBST.deleteNode(newBST.root, 90);
        System.out.println();
        newBST.levelOrder();
        newBST.deleteBST();
        newBST.levelOrder();
    }
}
