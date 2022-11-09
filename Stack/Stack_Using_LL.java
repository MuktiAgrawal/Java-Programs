public class Stack_Using_LL {
    Singly_linkedlist sll;
    public Stack_Using_LL(){
        sll=new Singly_linkedlist();
    }
    // Push method
    public void push(int value){
        sll.insert(value,0);
    }
    // isEmpty
    public boolean isEmpty(){
        if(sll.head==null)
            return true;
        return false;
    }
    // Pop method
    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            result=sll.head.value;
            sll.delete(0);
        }
        return result;
    }
    // Peek method
    public int peek(){
        int result=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            result=sll.head.value;
        }
        return result;
    }
    public void deleteStack(){
        sll.head=null;
        sll.tail=null;
        System.out.println("Stack successfully deleted!");
    }
}
