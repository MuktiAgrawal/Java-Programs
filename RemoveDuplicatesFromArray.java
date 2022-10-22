/* Program to remove duplicate numbers from a sorted integer array */
import java.util.Arrays;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5};
        RemoveDuplicatesFromArray obj=new RemoveDuplicatesFromArray();
        int n=obj.countUniqueNumbers(arr); // n stores number of unique elements in the array arr
        int b[]=new int[n]; // creates a new array to store unique elements
        b=obj.removeDuplicates(arr,n); // array after removal of duplicate elements
        System.out.println(Arrays.toString(b)); // displays the unique elements array
    }
    public int countUniqueNumbers(int a[]){
        int count=0;
        if(a.length==0 || a.length==1) // if array stores 0 or 1 element then it returns a.length
            return a.length;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){ // checks if two adjacent elements are same or different
                count++;
            }
        }
        if(a[a.length-2]!=a[a.length-1]) // compares the last and second last element and increments 1 if true
            count++;
        return count;
    }
    public int[] removeDuplicates(int a[],int n){
        int b[]=new int[n];
        int j=0; // index for new array
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                b[j++]=a[i];
            }
        }
        if(j==n-1) // checks if last element is unique or not if yes then next statement is executed
            b[j]=a[a.length-1];
        return b;
    }
}
