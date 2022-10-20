import java.util.*;
public class SumOF_Max_and_Min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SumOF_Max_and_Min obj=new SumOF_Max_and_Min();
        System.out.println("Enter no. of test cases");
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            System.out.println("Enter elements of array");
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println("Sum of max and min elements of array is "+(obj.sumOfMaxMin(arr, n)));
        }
    }
    public static int sumOfMaxMin(int[] arr, int n) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);        
        }
        return max+min;
    }
}
