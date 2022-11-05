public class Main {
    public static void main(String[] args) {
        Stack1 s=new Stack1(5);
        s.push(5);
        s.push(3);
        s.push(1);
        s.push(3);
        s.push(7);
        s.push(8);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.peek());
        s.delete();
        System.out.println(s.pop());
    }
}
