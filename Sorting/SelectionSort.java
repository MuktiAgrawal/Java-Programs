public class SelectionSort {
    public static void selectionsort(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=arr[i];
            }
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
