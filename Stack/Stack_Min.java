public class Stack_Min {
    Node_Stack_min top;
    Node_Stack_min min;
    
    public Stack_Min(){ // two nodes of different linked lists created
        top=null;
        min=null;
    }
    public int min(){ // returns minimum value
        return min.value;
    }
    public void push(int value){
        if(min==null){
            min=new Node_Stack_min(value,min);
        }
        else if(min.value<value){
            min=new Node_Stack_min(min.value, min);
        }
        else{
            min=new Node_Stack_min(value, min);
        }
        /** min=null 
        3->null
        2->3->null
        2->2->3->null
         */
        top=new Node_Stack_min(value, top); // pushes an element in linked list and the new element points to the previous value of top. It is insertion at beginning
        // top = null
        // 3 -> null
        // 2 -> 3-> null
        // 5 -> 2-> 3 -> null
    }
    public int pop(){ // deletes an element from the beginning of linked list
        min=min.next;
        int result=top.value;
        top=top.next;
        return result;
    }
}
