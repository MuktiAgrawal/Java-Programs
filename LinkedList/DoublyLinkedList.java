public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    public DoublyNode createDLL(int nodeValue){
        head=new DoublyNode();
        DoublyNode node=new DoublyNode();
        node.value=nodeValue;
        node.next=node.prev=null;
        head=tail=node;
        size=1;
        return head;
    }
    public void insertDLL(int nodeValue,int location){
        DoublyNode node=new DoublyNode();
        node.value=nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;
        }
        else if(location==0){
            node.prev=null;
            node.next=head;
            head.prev=node;
            head=node;
        }
        else if(location>=size){
            node.next=null;
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
        else{
            DoublyNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            node.next=tempNode.next;
            node.prev=tempNode;
            tempNode.next=node;
            node.next.prev=node;
        }
        size++;
        return;
    }
    public void traverseDLL(){
        if(head==null){
            System.out.println("DLL does not exist");
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
    public void reverseTraverseDLL(){
        if(head==null){
            System.out.println("DLL does not exist");
            return;
        }
        DoublyNode tempNode=tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            tempNode=tempNode.prev;
            if(i!=size-1){
                System.out.print(" <- ");
            }
        }
        System.out.println("\n");
    }
    public boolean searchDLL(int nodeValue){
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

    public void deleteNodeInDLL(int location){
        if(head==null){
            System.out.println("Doubly linked list does not exist");
            return;
        }
        else if(location==0){
            if(size==1){
                head=tail=null;
                size--;
                return;
            }
            head=head.next;
            head.prev=null;
            size--;
        }
        else if(location>=size-1){ 
            if(size==1){
                head=tail=null;
                size--;
                return;
            }
            else{
                tail=tail.prev;
                tail.next=null;
                size--;
            }
        }
        else{
            DoublyNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }
    public void deleteEntireDLL(){
        DoublyNode tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=tail=null;
        System.out.println("SLL deleted successfully");
    }
}
