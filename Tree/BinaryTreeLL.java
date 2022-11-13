import java.util.LinkedList;
import java.util.Queue;
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
    
    // Inorder Traversal
    public void inorder(BinaryNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    // Postorder Traversal
    public void postOrder(BinaryNode node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    // Level Order Traversal
    public void levelOrder(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.println(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    //Search method
    public void searchBinaryNode(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value==value){
                System.out.println("Value "+value+" is found in tree");
                return;
            }
            else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Value "+value+" not found in tree");
    }
}
