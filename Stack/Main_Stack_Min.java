public class Main_Stack_Min {
    public static void main(String[] args) {
        Stack_Min newStack=new Stack_Min();
        newStack.push(3);
        newStack.push(2);
        newStack.push(5);
        System.out.println(newStack.min());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.min());
    }
}      
