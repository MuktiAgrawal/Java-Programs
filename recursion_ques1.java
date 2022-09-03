import java.util.*;
public class recursion_ques1 {
    int sum=0;
    int sum_of_digits(int n)
    {   if(n<0)
        return -1;
        if(n==0)
        return sum;
        sum+=n%10;
        return sum_of_digits(n/10);
    }
    public static void main(String[]args)
    {
        recursion_ques1 obj=new recursion_ques1();
        int s=obj.sum_of_digits(456);
        System.out.println(s);
    }
}
