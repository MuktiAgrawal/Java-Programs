public class Main {
    public static void main(String[] args) {
        BinaryHeap newBH=new BinaryHeap(5);
        // newBH.peek();
        // System.out.println(newBH.sizeOFBH());
        // newBH.levelOrder();
        newBH.insert(10,"Max");
        newBH.insert(5,"Max");
        newBH.insert(15,"Max");
        newBH.insert(1,"Max");
        newBH.levelOrder();
        newBH.extractHeadOfBH("Max");
        newBH.levelOrder();
        newBH.extractHeadOfBH("Max");
        newBH.levelOrder();
        newBH.deleteBH();
        newBH.levelOrder();
    }

}
