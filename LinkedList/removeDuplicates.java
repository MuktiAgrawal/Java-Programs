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
    }
    public void removeDups(Linked list l1){
        HashSet<Integer> set=new HashSet<>();
        Node tempNode=sll.head;
        Node temp;
        for(int i=0;i<sll.size;i++){
            for(int j=i+1;j<sll.size;j++)
        }
    }
}
