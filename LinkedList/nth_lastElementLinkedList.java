public class nth_lastElementLinkedList {
    public static void main(String[] args) {
        Singly_linkedlist sll=new Singly_linkedlist();
        sll.insert(1,0);
        sll.insert(2,1);
        sll.insert(3,2);
        sll.insert(4,3);
        sll.insert(5,4);
        sll.traversal();
        nth_lastElementLinkedList nth=new nth_lastElementLinkedList();
        System.out.println(nth.nthLastLL(2, sll).value);   
        System.out.println(nth.nthToLast(3, sll).value);
    }
    // 1st approach
    public Node nthToLast(int n,Singly_linkedlist ll){ // when size is not known
        Node p1=ll.head;
        Node p2=ll.head;
        for(int i=0;i<n;i++){
            if(p2==null)
                return null;
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
    // 2nd approach
    public Node nthLastLL(int n,Singly_linkedlist sll){
        Node currNode=sll.head;
        for(int i=0;i<sll.size-n;i++){
            currNode=currNode.next;
        }
        return currNode;
    }
}
