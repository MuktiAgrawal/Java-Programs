public class Intersection {
    public static void main(String[] args) {
        Singly_linkedlist sll1=new Singly_linkedlist();
        Singly_linkedlist sll2=new Singly_linkedlist();
        Intersection obj=new Intersection();
        sll1.insert(1,0);
        sll1.insert(2,1);
        sll1.insert(3,2);
        sll1.insert(3,3);
        obj.addSameNode(sll1, sll2, 7);
        obj.addSameNode(sll1, sll2, 2);
        obj.addSameNode(sll1, sll2, 9);
        sll2.insert(2,0);
        sll2.insert(2,1);
        sll2.insert(3,2);
        sll1.traversal();
        sll2.traversal();
        Node inter=obj.intersectingLL(sll1, sll2);
        System.out.println(inter.value);
    }
    public Node intersectingLL(Singly_linkedlist l1,Singly_linkedlist l2){
        Node tempNode1=l1.head;
        Node tempNode2=l2.head;
        if(tempNode1==null || tempNode2==null)
            return null;
        if(l1.tail!=l2.tail)
            return null;
        if(l1.size>l2.size){
            for(int i=0;i<l2.size-l1.size;i++){
                tempNode1=tempNode1.next;
            }
        }
        else if(l2.size>l1.size){
            for(int i=0;i<l1.size-l2.size;i++){
                tempNode2=tempNode2.next;
            }
        }
        while(tempNode1!=tempNode2){
            tempNode1=tempNode1.next;
            tempNode2=tempNode2.next;
        }
        return tempNode1;
    }
    void addSameNode(Singly_linkedlist llA, Singly_linkedlist llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        newNode.next=null;
    }
    // void addSameNode(Singly_linkedlist l1,Singly_linkedlist l2,int nodeValue){
    //     Node newNode=new Node();
    //     newNode.value=nodeValue;
    //     l1.tail.next=newNode;
    //     l1.tail=newNode;
    //     l2.tail.next=newNode;
    //     l2.tail=newNode;
    // }
}
