public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i],j=i;
            while(j>0 && temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
