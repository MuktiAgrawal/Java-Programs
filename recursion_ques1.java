// Program to calculate sum of digits of a number using recursion
public class recursion_ques1 {
    int sum=0;
    int sum_of_digits(int n)//function prototype
    {   if(n<0)//unintentional case
        return -1;
        if(n==0)//base case
        return sum;
        sum+=n%10;//sums the last digit of the number n
        return sum_of_digits(n/10);//recursive call
    }
    public static void main(String[]args)
    {
        recursion_ques1 obj=new recursion_ques1();// creation of a class object
        int s=obj.sum_of_digits(456);// stores the value returned by sum_of_digits function
        System.out.println(s);//prints the returned value
    }
}
