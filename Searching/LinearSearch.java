public class LinearSearch {
    public static int linearsearch(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                System.out.println("The element is found at index: "+i);
                return i;
            }
        }
        System.out.println("The element "+value+" is not found in the array.");
        return -1;
    }
}
