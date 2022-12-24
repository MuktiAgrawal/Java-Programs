class MainQuickSort{
    public static void main(String[] args) {
        int array[]={10,3,2,7,4,2,4,6,5,8,9,1};
        QuickSort.quickSort(array, 0, array.length-1);
        QuickSort.printArray(array);
    }
}