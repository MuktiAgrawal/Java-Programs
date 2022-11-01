public class MainCSLL {
    public static void main(String[] args) {
        Circular_SinglyLinkedList csll =new Circular_SinglyLinkedList();
        csll.createCSLL(4);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        csll.insertCSLL(5,0);
        csll.insertCSLL(6,3);
        csll.insertCSLL(7,1);
        csll.traverseCSLL();
        csll.searchCSLL(7);
        csll.deleteNodeinCSLL(2);
        csll.traverseCSLL();
        csll.deleteEntireCSLL();
        csll.traverseCSLL();
    }
}
