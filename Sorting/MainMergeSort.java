public class MainMergeSort {
    public static void main(String[] args) {
        int array[]={10,2,3,4,2,5,8,9};
        MergeSort.mergeSort(array, 0, array.length-1);
        MergeSort.printArray(array);
    }
}
