public class Singly_linkedlist {
    public Node head;
    public Node tail;
    public int size;
    // Creation of a singly linked list
    public Node createSinglyLinkedList(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    // Insertion in singly linked list
    public void insert(int value, int location){
        Node node=new Node();
        node.value=value;
        if(head==null){
            createSinglyLinkedList(value);
            return;
        }
        // Insertion at beginning
        else if(location==0){
            node.next=head;
            head=node;
        }
        // Insertion at last
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        // Insertion at any given location
        else{
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next; // tempNode is the Node after which new node is to be inserted
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
    }
    // Traversal in singly linked list
    public void traversal(){
        if(head==null){
            System.out.println("SLL does not exist");
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1)
                System.out.print(" -> ");
                tempNode=tempNode.next;
            }
        }
        System.out.println("\n");
    }
    // Method for searching a value in singly linked list
    boolean searchNode(int nodevalue){
        if(head!=null){
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodevalue){
                    System.out.println("Node found at location "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }
}
