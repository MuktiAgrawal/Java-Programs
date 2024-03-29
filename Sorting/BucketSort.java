import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
    int arr[];

    // Constructor
    public BucketSort(int arr[]){
        this.arr=arr;
    }

    // Print buckets
    public void printBucket(ArrayList<Integer>[] buckets){
        for(int i=0;i<buckets.length;i++){
            System.out.println("\nBucket#"+i+":");
            for(int j=0;j<buckets[i].size();j++){
                System.out.print(buckets[i].get(j)+" ");
            }
        }
    }
    // Bucket Sorting 
    public void bucketsort(){
        int numberOfBuckets=(int)Math.ceil(Math.sqrt(arr.length));
        int maxValue=Integer.MIN_VALUE;
        for(int value:arr){
            if(value>maxValue){
                maxValue=value;
            }
        }
        ArrayList<Integer>[] buckets=new ArrayList[numberOfBuckets];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<Integer>();
        }

        // Adding elements of array to buckets
        for(int value:arr){
            int bucketNumber=(int)Math.ceil(((float)value*numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }
        System.out.println("\n\n Printing buckets before sorting");
        printBucket(buckets);

        // Sorting the buckets
        for(ArrayList<Integer> bucket:buckets){
            Collections.sort(bucket);
        }
        System.out.println("\n\n Printing buckets after sorting");
        printBucket(buckets);

        // Merging the sorted buckets in the original array
        int index=0;
        for(ArrayList<Integer> bucket:buckets){
            for(int value:bucket){
                arr[index]=value;
                index++;
            }
        }
    }

    public void printArray(int arr[]){
        System.out.println("\nArray after sorting");
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
