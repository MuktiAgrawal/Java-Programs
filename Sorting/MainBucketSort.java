public class MainBucketSort {
    public static void main(String[] args) {
        int arr[]={3,2,1,4,9,8,6,7,5};
        BucketSort bs=new BucketSort(arr);
        bs.bucketsort();
        bs.printArray(arr);
    }
}
