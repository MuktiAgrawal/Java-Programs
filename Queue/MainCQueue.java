public class MainCQueue {
    public static void main(String[] args) {
        CQueueArray cqueue=new CQueueArray(4);
        cqueue.enqueue(1);
        cqueue.enqueue(2);
        cqueue.enqueue(3);
        cqueue.enqueue(4);
        cqueue.enqueue(5);
        System.out.println(cqueue.dequeue());
        System.out.println(cqueue.dequeue());
        cqueue.enqueue(5);
        cqueue.enqueue(6);
        cqueue.enqueue(7);
        System.out.println(cqueue.peek());
        cqueue.deleteCQueue();
    }
}
