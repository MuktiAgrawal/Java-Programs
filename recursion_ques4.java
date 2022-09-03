/*Program to convert decimal number to binary*/
public class recursion_ques4 {
    public int dec_to_binary(int n)
    {
        if(n/2==0) // base case
        return n%2;
        return (n%2)+dec_to_binary(n/2)*10; //recursive case
        //The above statement inverts the binary digit at each step by multiply with 10 
    }
    public static void main(String[] args) {
        recursion_ques4 obj=new recursion_ques4(); // Object creation
        int b=obj.dec_to_binary(13); // function call 
        System.out.println(b);
    }
}
