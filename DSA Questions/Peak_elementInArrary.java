/* A peak element is one which is not smaller than its neighbors */
/* Question Link: https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/ */

// Time complexity: O(log n)
// Auixiliary space O(1)
public class Peak_elementInArrary {
    static int findPeak(int arr[],int n){
        int low=0;
        int high=n-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
                return mid;
            }
            else if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,20,7,9};
        int n=arr.length;
        System.out.println("Index of peak elements is "+findPeak(arr, n));
    }
}
