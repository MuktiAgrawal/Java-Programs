/*Program to calculate power of numbers using recursion*/
public class recursion_ques2 {
    public double power(int n,int p)
    {
        if(p<0) // case for negative powers
        return (1.0/n)*power(n,p+1);
        else if(p>0) // case for positive powers
        return n*power(n,p-1);
        else // base case
        return 1;
    }
    public static void main(String[]args)
    {
        recursion_ques2 obj=new recursion_ques2(); // class object creation
        double result=obj.power(3,-1); // function call
        System.out.println(result); // prints result
    }
}
