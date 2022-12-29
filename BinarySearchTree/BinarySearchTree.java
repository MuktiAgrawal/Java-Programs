import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {
    BinaryNode root;
    BinarySearchTree(){
        root=null;
    }
    private BinaryNode insert(BinaryNode currNode,int value){
        if(currNode==null){
            BinaryNode newNode=new BinaryNode();
            newNode.value=value;
            System.out.println("The value successfully inserted");
            return newNode;
        }
        else if(value<=currNode.value){
            currNode.left=insert(currNode.left,value);
            return currNode;
        }
        else{
            currNode.right=insert(currNode.right,value);
            return currNode;
        }
    }
    void insert(int value){
        root=insert(root,value);
    }

    //Preorder Traversal
    public void preOrder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    //Inorder Traversal
    
    public void InOrder(BinaryNode node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.value+" ");
        InOrder(node.right);
    }
    //Postorder Traversal
    public void PostOrder(BinaryNode node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value+" ");
    }
    // Level Order Traversal
    public void levelOrder(){
        // queue is an interface not a class
        // we can implement it using LinkedList or PriorityQueue
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    //Searching
    public BinaryNode search(BinaryNode node,int value){
        if(node==null){
            System.out.println("\nThe value does not exist in BST");
            return null;
        }
        else if(node.value==value){
            System.out.println("\nValue "+value+" found in BST");
        }
        else if(value<node.value){
            return search(node.left,value);
        }
        else{
            return search(node.right,value);
        }
        return null;
    }

    //Deletion
    //Minimum node
    public static BinaryNode minimumNode(BinaryNode root){
        if(root.left==null){
            return root;
        }
        else{
            return minimumNode(root.left);
        }
    }
    // Delete node
    public BinaryNode deleteNode(BinaryNode root,int value){
        if(root==null){
            System.out.println("The value not found in BST");
            return null;
        }
        if(value<root.value){
            root.left=deleteNode(root.left,value);
        }
        else if(value>root.value){
            root.right=deleteNode(root.right,value);
        }
        else{
            if(root.left!=null && root.right!=null){
                BinaryNode temp=root;
                BinaryNode minNodeForRight=minimumNode(temp.right);
                root.value=minNodeForRight.value;
                root.right=deleteNode(root.right, minNodeForRight.value);
            }
            else if(root.left!=null){
                root=root.left;
            }
            else if(root.right!=null){
                root=root.right;
            }
            else{
                root=null;
            }
        }
        return root;
    }
    // Delete entire BST
    public void deleteBST(){
        root=null;
        System.out.println("\nBST successfully deleted");
    }
}
