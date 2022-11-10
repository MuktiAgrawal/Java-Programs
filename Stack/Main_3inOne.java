public class Main_3inOne
{
    public static void main(String[] args) {
        ThreeInOne newStacks=new ThreeInOne(3);
        System.out.println(newStacks.isFull(1));
        System.out.println(newStacks.isEmpty(2));
        newStacks.push(0,1);
        newStacks.push(0,2);
        newStacks.push(0,3);
        newStacks.push(1,1);
        System.out.println(newStacks.pop(1));
        System.out.println(newStacks.pop(0));
        System.out.println(newStacks.peek(0));
    }
}