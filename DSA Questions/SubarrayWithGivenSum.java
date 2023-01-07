/** Program to find contiguous subarray with given sum */
import java.util.ArrayList;
class SubarrayWithGivenSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int currentsum=arr[0];
        int start=0;
        if(s<=0){
            ls.add(-1);
            return ls;
        }
        for(int i=1;i<=n;i++){
            while(currentsum>s && start<i){
                currentsum=currentsum-arr[start];
                start++;
            }
            if(currentsum==s){
                ls.add(start+1);
                ls.add(i);
                return ls;
            }
            if(i<n)
                currentsum+=arr[i];
        }
        ls.add(-1);
        return ls;
    }
}