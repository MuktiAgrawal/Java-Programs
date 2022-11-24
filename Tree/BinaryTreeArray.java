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
}
