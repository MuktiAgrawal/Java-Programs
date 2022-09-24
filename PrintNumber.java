//Method overloading by changing data types of same name methods
public class PrintNumber {
    void printn(int a)
    {
        System.out.println(a);
    }
    void printn(double a)
    {
        System.out.println(a);
    }
    void printn(char a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        PrintNumber obj=new PrintNumber();
        obj.printn(5);
        obj.printn(5.6d);
        obj.printn('e');
    }
}
