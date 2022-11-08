public class QueueArray {
    int [] arr;
    int front;
    int rear;
    public QueueArray(int size){
        this.arr=new int[size];
        front=rear=-1;
        System.out.println("Queue is successfully created with size of: "+size);
    }
    public boolean isFull(){
        if(rear==arr.length-1){
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        if(front==-1)
            return true;
        else
            return false;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else if(isEmpty()){
            front=0;
            rear++;
            arr[rear]=value;
            System.out.println("Successfully inserted value in queue");
        }
        else{
            rear++;
            arr[rear]=value;
            System.out.println("Successfully inserted value in queue");
        }
    }
    public int dequeue(){
        int temp;
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else if(front==rear){
            temp=arr[front];
            front=rear=-1;
        }
        else{
            temp=arr[front++];
        }
        return temp;
    }
    public int peek(){
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("The queue is empty");
            return -1;
        }
    }
    public void delete(){
        arr=null;
        System.out.println("Queue successfully deleted!");
    }
}
