import java.util.*;
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i=0,sum=0,j;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(j=i;i<n && j<n;j++)
        {
            sum+=arr[j];
            if(sum==s)
            {
                a.add(i+1);
                a.add(j+1);
                return a;
            }
            if(j==n-1)
            {
                ++i;
                j=i-1;
                sum=0;
            }
        }
        a.add(-1);
        return a;
    }
}
public class Subarray_given_sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter sum");
        int s=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>(2);
        a=Solution.subarraySum(arr, n, s);
        System.out.println(a);
    }
}