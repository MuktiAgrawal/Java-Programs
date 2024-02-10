public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (head == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        while (node.next.val != val) {
            node = node.next;
        }
        node.next = node.next.next;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
