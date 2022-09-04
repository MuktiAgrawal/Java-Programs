public class time_complexity_ques1
{
    public void add_multiply(int arr[]) // Time complexity: O(n)
    {
        int sum=0; // O(1)
        int product=1; // O(1)
        for(int i=0;i<arr.length;i++) // O(n)
        {
            sum+=arr[i]; // O(1)
        }
        for(int i=0;i<arr.length;i++) // O(n)
        {
            product*=arr[i]; // O(1)
        }
        System.out.println("Sum: "+sum+"\tProduct: "+product);
    }
    public static void main(String[] args) {
        time_complexity_ques1 o=new time_complexity_ques1();
        int [] a={1,5,3,4};
        o.add_multiply(a);
    }
}