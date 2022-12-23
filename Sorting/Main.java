public class Main {
    public static void main(String[] args) {
        int arr[]={10,5,4,2,19};
        BubbleSort bs=new BubbleSort();
        bs.bubblesort(arr);
        bs.printArray(arr);
        SelectionSort.selectionsort(arr);
        SelectionSort.printArray(arr);
        InsertionSort.insertionSort(arr);
        InsertionSort.printArray(arr);
    }  
}
