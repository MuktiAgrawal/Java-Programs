public class BinaryTreeArray {
    String [] arr;
    int lastUsedIndex;

    // parameterized constructor
    public BinaryTreeArray(int size){
        arr=new String[size];
        this.lastUsedIndex=0;
        System.out.println("Binary tree of size "+size+" has been created");
    }
    // isFull method
    public boolean isFull(){
        if(this.lastUsedIndex==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    // insert method
    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted at "+lastUsedIndex);
        } 
        else{
            System.out.println("The binary tree is full");
        }
    }

    // preorder
    public void preorder(int index){
        if(index>lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preorder(index*2);
        preorder(index*2+1);
    }

    // inorder
    public void inorder(int index){
        if(index>lastUsedIndex){
            return;
        }
        inorder(index*2);
        System.out.print(arr[index]+" ");
        inorder(index*2+1);
    }

    // postorder
    public void postorder(int index){
        if(index>lastUsedIndex){
            return;
        }
        postorder(index*2);
        postorder(index*2+1);
        System.out.print(arr[index]+" ");
    }
    
    // levelorder traversal
    public void levelOrder(){
        System.out.println();
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // searching 
    public int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.println("\n"+value+" is found at location: "+i);
                return i;
            }
        }
        System.out.println("The value does not exist in binary tree");
        return -1;
    }

    // delete a node
    public void delete(String value){
        int location=search(value);
        if(location ==-1){
            return;
        }
        else{
            arr[location]=arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node successfully deleted");
        }
    }

    // delete binary tree
    public void deleteBinaryTree(){
        try{
            arr=null;
            System.out.println("\nThe binary tree has been successfully deleted");
        }
        catch(Exception ex){
            System.out.println("\nThere was an error deleting the tree");
        }
    }
}
