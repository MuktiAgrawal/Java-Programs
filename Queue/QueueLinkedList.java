public class QueueLinkedList {
    Singly_linkedlist list;
    public QueueLinkedList(){
        list=new Singly_linkedlist();
        System.out.println("Queue successfully created!");
    }
    //isEmpty
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        else{
            return false;
        }
    }
    // enqueue
    public void enqueue(int value){
        list.insert(value,list.size);
        System.out.println("Successfully inserted value "+value);
    }
    public int dequeue(){
        int value=-1;
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            value=list.head.value;
            list.delete(0);
        }
        return value;
    }
    public int peek(){
        int value=-1;
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            value=list.head.value;
        }
        return value;
    }
    // delete
    public void deleteQueue(){
        list.head=null;
        list.tail=null;
        System.out.println("Queue successfully deleted");
    }
}
