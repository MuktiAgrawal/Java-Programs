public class MainCDLL {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
        cdll.createCDLL(5);
        System.out.println(cdll.head.value);
        cdll.insertCDLL(4,0);
        cdll.insertCDLL(8,2);
        cdll.insertCDLL(9, 1);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
        cdll.searchCDLL(4);
        cdll.deleteNodeInCDLL(1);
        cdll.traverseCDLL();
        cdll.deleteEntireCDLL();
        cdll.traverseCDLL();
    }
}
