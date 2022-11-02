public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    public DoublyNode createCDLL(int nodeValue){
        head=new DoublyNode();
        DoublyNode node=new DoublyNode();
        node.next=node;
        node.prev=node;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public void insertCDLL(int nodeValue,int location){
        DoublyNode node=new DoublyNode();
        node.value=nodeValue;
        if(head==null){
            createCDLL(nodeValue);
            return;
        }
        else if(location==0){
            node.next=head;
            node.prev=tail;
            head.prev=node;
            head=node;
            tail.next=node;
            size++;
            return;
        }
        else if(location>=size){
            node.next=head;
            node.prev=tail;
            tail.next=node;
            tail=node;
            head.prev=tail;
            size++;
        }
        else{
            DoublyNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            node.next=tempNode.next;
            node.prev=tempNode;
            node.next.prev=node;
            tempNode.next=node;
            size++;
        }
    }
    public void traverseCDLL(){
        if(head==null){
            System.out.println("CDLL does not exist");
            return;
        }
        DoublyNode tempNode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode=tempNode.next;
            if(i!=size-1){
                System.out.print(" -> ");
            }
        }
        System.out.println("\n");
    }
    public void reverseTraverseCDLL(){
        if(head!=null){
            DoublyNode tempNode=tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                tempNode=tempNode.prev;
                if(i!=size-1){
                    System.out.print(" <- ");
                }
            }
        }
        else{
            System.out.println("The CDLL does not exist!");
        }
        System.out.println("\n");
    }
    boolean searchCDLL(int nodeValue){
        if(head!=null){
            DoublyNode tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Node found at location "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node does not exist");
        return false;
    }
}
