public class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL(){
        this.root=null;
    }

    // Preorder Traversal
    public void preorder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    
}
