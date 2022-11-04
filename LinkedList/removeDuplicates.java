import java.util.HashSet;
public class removeDuplicates {
    public static void main(String[] args) {
        Singly_linkedlist sll=new Singly_linkedlist();
        sll.insert(1,0);
        sll.insert(2,1);
        sll.insert(3,2);
        sll.insert(4,3);
        sll.insert(3,4);
        sll.traversal();
        removeDuplicates rd=new removeDuplicates();
        rd.removeDups(sll);
        sll.traversal();
    }
    public void removeDups(Singly_linkedlist ll){
        HashSet<Integer> set=new HashSet<>();
        Node tempNode=ll.head;
        Node prev=null;
        while(tempNode!=null){
            if(!set.contains(tempNode.value)){
                set.add(tempNode.value);
                prev=tempNode;
            }
            else{
                prev.next=tempNode.next;
                ll.size--;
            }
            tempNode=tempNode.next;
        }
    }
}
