public class Circular_SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    // Creation of a circular linked list
    public Node createCSLL(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=node;
        head=tail=node;
        size=1;
        return head;
    }
    // Insertion in circular linked list
    public void insertCSLL(int nodeValue,int location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }
        // Insertion at beginning
        else if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        // Insertion at last
        else if(location>=size){
            node.next=tail.next;
            tail.next=node;
            tail=node;
        }
        // Insertion at any given location
        else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            node.next=tempNode.next;
            tempNode.next=node;
        }
        size++;
        return;
    }
    // Traversal in circular linked list
    public void traverseCSLL(){
        if(head==null){
            System.out.println("Circular linked list does not exist");
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                tempNode=tempNode.next;
                if(i!=size-1){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    // Searching a node in CSLL
    boolean searchCSLL(int nodeValue){
        if(head==null){
            System.out.println("CSLL does not exist");
            return false;
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
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
