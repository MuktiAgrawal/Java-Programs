/*Program to find the GCD of two numbers using Euclidean algorithm*/
public class recursion_ques3 {
    public static int gcd(int a, int b) // gcd function using Euclidean algorithm
    {
        if(a<0 || b<0) // unintentional case
        return -1;
        if(b==0) // base case
        return a;
        return gcd(b,a%b); // recursive case
    }
    public static void main(String[] args) {
        int result=recursion_ques3.gcd(46,18); // since gcd is a static method, it can be called directly from the class
        System.out.println(result);
    }
}
