public class MainQueue {
    public static void main(String[] args) {
        QueueArray newQueue=new QueueArray(4);
        boolean result=newQueue.isEmpty();
        System.out.println(result);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.peek());
        System.out.println(newQueue.peek());
        newQueue.delete();
    }
}
