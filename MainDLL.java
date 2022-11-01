public class MainDLL {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(5, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        System.out.println(dll.head.value);
        System.out.println(dll.head.next.next.next.value);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchDLL(3);
        dll.deleteNodeInDLL(2);
        dll.traverseDLL();
        dll.deleteEntireDLL();
        dll.traverseDLL();
    }
}
