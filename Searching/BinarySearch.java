public class BinarySearch {
    public static int binarysearch(int arr[],int value){
        int start=0,end=arr.length-1;
        int middle=(start+end)/2;
        while(start<=end && arr[middle]!=value){
            if(arr[middle]>value){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
            middle=(start+end)/2;
        }
        if(arr[middle]==value){
            System.out.println("The element is found at the index: "+middle);
            return middle;
        }
        else{
            System.out.println("The element "+value+" not found");
            return -1;
        }
    }
}
