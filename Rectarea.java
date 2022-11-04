import java.util.*;
public class Rectarea {
    public int len,brd;
    void input(int l,int b)
    {
        len=l;
        brd=b;
    }
    int printarea()
    {
        return len*brd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectarea obj=new Rectarea();
        System.out.println("Enter length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        obj.input(l,b);
        System.out.println(obj.printarea()); 
    }
}
