public class CQueueArray {
    int [] arr;
    int front,rear;
    int size;
    public CQueueArray(int size){
        arr=new int[size];
        front=rear=-1;
        this.size=size;
        System.out.println("The CQ is successfully created with size of "+size);
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(front==rear+1 || (front==0 && rear==size-1)){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("The CQ is full");
        }
        else if(isEmpty()){
            arr[++rear]=value;
            ++front;
            System.out.println("Successfully inserted value "+value);
        }
        else{
            if(rear==size-1){
                rear=0;
            }
            else{
                rear++;
            }
            arr[rear]=value;
            System.out.println("Successfully inserted value "+value);
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The CQ is empty");
            return -1;
        }
        else{
            int temp=arr[front];
            arr[front]=-1;
            if(front==rear)
                front=rear=-1;
            else if(front==size-1){
                front=0;
            }
            else
                front++;
            return temp;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return arr[front];
        }
        else{
            System.out.println("The CQ is empty");
            return -1;
        }
    }
    public void deleteCQueue(){
        arr=null;
        System.out.println("CQueue successfully deleted!");
    }
}
