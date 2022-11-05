class Main_StackLL {
    public static void main(String[] args) {
        Stack_Using_LL s=new Stack_Using_LL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.sll.traversal();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.sll.traversal();
        System.out.println(s.peek());
        s.deleteStack();
        s.sll.traversal();
    }
}
