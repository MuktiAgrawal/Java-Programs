public class partition {
    public static void main(String[] args) {
        Singly_linkedlist sll=new Singly_linkedlist();
        sll.insert(1,0);
        sll.insert(9,1);
        sll.insert(7,2);
        sll.insert(11,3);
        sll.insert(2,4);
        sll.traversal();
        partition p=new partition();
        Singly_linkedlist l=p.part(8,sll);
        l.traversal();
    }
    public Singly_linkedlist part(int x,Singly_linkedlist sll){
        Node tempNode=sll.head;
        sll.tail=sll.head;
        while(tempNode!=null){
            Node next=tempNode.next;
            if(tempNode.value<x){
                tempNode.next=sll.head;
                sll.head=tempNode;
            }
            else{
                sll.tail.next=tempNode;
                sll.tail=tempNode;
            }
            tempNode=next;
        }
        sll.tail.next=null;
        return sll;
    }       
}
