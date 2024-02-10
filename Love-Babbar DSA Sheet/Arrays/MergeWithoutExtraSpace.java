public class MergeWithoutExtraSpace {
        //Function to merge the arrays.
        // The below function exceeds time limit
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i,j;
        long last;
        for(i=m-1;i>=0;i--){
            last=arr1[n-1];
            for(j=n-2;j>=0 && arr2[i]<arr1[j];j--){
                arr1[j+1]=arr1[j];
            }
            if(j!=n-2 || last>arr2[i]){
                arr1[j+1]=arr2[i];
                arr2[i]=last;
            }
        }
    }
    
    public static void merge1(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i,k;
        for(  i =0 ; i< n ;i ++)
        {
            if(arr1[i]>arr2[0])
            {
                long temp = arr1[i];
                arr1[i]=arr2[0];
                arr2[0]= temp;
            }
            long first = arr2[0];
            for(  k =1; k<m && arr2[k]<first; k++)
            {
                arr2[k-1]=arr2[k];
            }
            arr2[k-1]= first;
        }
        
    }
}
