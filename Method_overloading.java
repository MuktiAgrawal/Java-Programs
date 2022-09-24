// Method overloading by changing order of parameters
public class Method_overloading {
    void first(int n,char c)
    {
        System.out.println(n);
        System.out.println(c);
    }
    void first(char c,int n)
    {
        System.out.println(n);
        System.out.println(c);
    }
    public static void main(String[] args) {
        Method_overloading obj=new Method_overloading();
        obj.first(5,'b');
        obj.first('c',6);
    }    
}
