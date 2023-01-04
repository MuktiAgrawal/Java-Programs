public class MainHeapSort {
    public static void main(String[] args) {
        int arr[]={2,7,3,1,4,8,9};
        HeapSort hs=new HeapSort(arr);
        hs.sort();
        hs.printArray();
    }
}
