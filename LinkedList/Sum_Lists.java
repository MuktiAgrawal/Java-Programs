/*Program to sum two integers stored in different lists in reverse order*/
public class Sum_Lists {
    public static void main(String[] args) {
        Singly_linkedlist sll1=new Singly_linkedlist();
        Singly_linkedlist sll2=new Singly_linkedlist();
        sll1.insert(1,0);
        sll1.insert(1,1);
        sll1.insert(2,2);
        sll1.insert(1,3);
        sll1.traversal();
        sll2.insert(8,0);
        sll2.insert(8,1);
        sll2.insert(8,2);
        sll2.insert(8,3);
        sll2.traversal();
        Sum_Lists obj=new Sum_Lists();
        Singly_linkedlist sll3=obj.sumOfLists(sll1, sll2);
        sll3.traversal();
    }
    public Singly_linkedlist sumOfLists(Singly_linkedlist sll1,Singly_linkedlist sll2){
        Node tempNode1=sll1.head;
        Node tempNode2=sll2.head;
        int carry=0;
        Singly_linkedlist sll3=new Singly_linkedlist();
        while(tempNode1!=null || tempNode2!=null){
            int sum=carry;
            if(tempNode1!=null){
                sum+=tempNode1.value;
                tempNode1=tempNode1.next;
            }
            if(tempNode2!=null){
                sum+=tempNode2.value;
                tempNode2=tempNode2.next;
            }
            sll3=insertAtLast(sum%10,sll3);
            carry=sum/10;
        }
        if(carry>0)
            sll3=insertAtLast(carry, sll3);
        return sll3;
    }
    public Singly_linkedlist insertAtLast(int value,Singly_linkedlist sll){
        Node node=new Node();
        node.value=value;
        if(sll.head==null){
            sll.createSinglyLinkedList(value);
            return sll;
        }
        else{
            sll.tail.next=node;
            sll.tail=node;
            sll.tail.next=null;
            sll.size++;
        }
        return sll;
    }
}
