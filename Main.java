public class Main{
    public static void main(String[] args) {
        Singly_linkedlist sll=new Singly_linkedlist();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);
        // System.out.println(sll.head.next.value); throws an exception
        sll.insert(6,0); // location starts from 0
        sll.insert(8,3);
        sll.insert(9,2);
        // System.out.println(sll.head.value);
        // System.out.println(sll.head.next.value);
        // System.out.println(sll.head.next.next.value);
        sll.traversal();
        // sll.searchNode(9);
        sll.delete(1);
        sll.traversal();
        sll.deleteEntireSLL();
        sll.traversal();
    }
}