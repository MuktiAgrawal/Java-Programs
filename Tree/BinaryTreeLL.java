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
    // Insert method
    void insert(String value){
        BinaryNode newNode=new BinaryNode();
        newNode.value=value;
        if(root==null){
            root=newNode;
            System.out.println("Successfully inserted node in tree");
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.left==null){
                presentNode.left=newNode;
                System.out.println("Successfully inserted node in tree");
                break;
            }
            else if(presentNode.right==null){
                presentNode.right=newNode;
                System.out.println("Successfully inserted node in tree");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
    // Get deepest node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }
    // Delete method
    // Does not work if there is only 1 element in binary tree
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode,presentNode=null;
        while(!queue.isEmpty()){
            previousNode=presentNode;
            presentNode=queue.remove();
            if(presentNode.left==null){
                previousNode.right=null;
                return;
            }
            else if(presentNode.right==null){
                presentNode.left=null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete given node
    void deleteNode(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
            if(presentNode.value==value){
                presentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
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
        System.out.println("The node does not exist");
    }
    void deleteBinaryTree(){
        root=null;
        System.out.println("BT has been successfully deleted");
    }
}
