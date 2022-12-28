public class negativeIntegersToOneSideInArray {
    public static int [] moveNegative(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={-7,0,5,6,-8,-10,-1};
        arr=moveNegative(arr);
        for(int a:arr)
            System.out.print(a+" ");
    }
}
