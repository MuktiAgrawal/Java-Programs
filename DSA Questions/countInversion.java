public class countInversion {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return merge(arr,0,(int)N-1);
        
    }
    static long merge(long arr[],int low,int high){
        int inversionCount=0;
        if(high>low){
            int mid=low+(high-low)/2;
            inversionCount+=merge(arr,low,mid);
            inversionCount+=merge(arr,mid+1,high);
            inversionCount+=mergeSort(arr,low,mid,high);
        }
        return inversionCount;
    }
    static long mergeSort(long arr[],int low,int mid,int high){
        long inv_count=0;
        int n1=mid-low+1;
        int n2=high-mid;
        long leftTmpArray[]=new long[n1];
        long rightTmpArray[]=new long[n2];
        for(int i=0;i<n1;++i){
            leftTmpArray[i]=arr[low+i];
        }
        for(int j=0;j<n2;++j){
            rightTmpArray[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(leftTmpArray[i]<=rightTmpArray[j]){
                arr[k++]=leftTmpArray[i++];
            }
            else{
                arr[k++]=rightTmpArray[j++];
                inv_count+=n1-i;
            }
        }
        while(i<n1){
            arr[k++]=leftTmpArray[i++];
        }
        while(j<n2){
            arr[k++]=rightTmpArray[j++];
        }
        
        return inv_count;
    }
}
