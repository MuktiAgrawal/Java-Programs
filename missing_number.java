/*Program to find missing number from an array of natural numbers */
public class missing_number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10};
        int len=arr.length;
        System.out.println("Missing number is "+number_missing(arr, len));
    }
    public static int number_missing(int arr[],int len)
    {
        int sum=0;
        for(int i=0;i<len;i++)
            sum+=arr[i];
        int sum2=((len+1)*(len+2))/2;
        return sum2-sum;
    }
}
