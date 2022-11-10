public class MainQueueLL {
    public static void main(String[] args) {
        QueueLinkedList qll=new QueueLinkedList();
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        boolean result=qll.isEmpty();
        System.out.println(result);
        System.out.println(qll.dequeue());
        System.out.println(qll.peek());
        qll.deleteQueue();
    }
}
