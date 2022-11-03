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
            node.next=tempNode.next;
            tempNode.next=node;
            // Node nextNode=tempNode.next;
            // tempNode.next=node;
            // node.next=nextNode;
        }
        size++;
        return;
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
            System.out.println("\n");
        }
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
    // Deleting a node from Singly Linked List
    public void delete(int location){
        if(head==null){
            System.out.println("Singly linked list does not exist");
            return;
        }
        else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }
        else if(location>=size-1){ 
            Node tempNode=head;
            for(int i=0;i<size-2;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                tail=head=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
    public void deleteEntireSLL(){
        head=null;
        tail=null;
        System.out.println("SLL deleted successfully");
    }
}
