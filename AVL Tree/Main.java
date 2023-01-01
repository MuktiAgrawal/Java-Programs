public class Main {
    public static void main(String[] args) {
        AVL newAVL=new AVL();
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);
        newAVL.delete(5);
        newAVL.levelOrder();
        newAVL.deleteAVL();
        newAVL.levelOrder();
    }
}
