public class Factorial_method_overload {
    void fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println(fact);
    }
    void fact(double n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Factorial_method_overload obj=new Factorial_method_overload();
        obj.fact(5);
        obj.fact(5.0);
    }
}
