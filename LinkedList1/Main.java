public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(1);
        list.insertAtEnd(10);
        list.insert(4, 3);
        list.insertRec(5, 2);
        // list.deleteFirst();
        // list.deleteLast();
        // list.delete(2);
        list.display();

        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(6);
        // list.insertFirst(9);
        // list.insertFirst(1);

        // CLL list = new CLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(75);
        // list.insert(45);
        // list.delete(3);
        // list.display();
    }
}
