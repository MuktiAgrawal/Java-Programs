public class Stack1 {
    int arr[];
    int top;
    // Creation of stack using array
    public Stack1(int size){
        this.arr=new int[size];
        top=-1;
        System.out.println("Stack of size "+size+" created successfully");
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top==arr.length-1)
            return true;
        else
            return false;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
            return;
        }
        arr[++top]=value;
        System.out.println("The value is successfully inserted");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[top];
    }
    public void delete(){
        arr=null;
        System.out.println("Stack successfully deleted!");
    }
}
