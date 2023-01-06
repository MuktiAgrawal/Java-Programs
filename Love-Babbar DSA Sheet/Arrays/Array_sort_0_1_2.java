/** Program that sorts an array consisting of 0,1 and 2 without using any sorting algo. */
// Dutch National Flag Problem 
class Array_sort_0_1_2
{
    // Using Pointer Approach
    public void sort012(int a[], int n)
    {
        // code here 
        int l,m,h;
        l=0;
        h=n-1;
        m=0;
        while(m<=h){
            int temp=-1;
            if(a[m]==0){
                temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
            }
            else if(a[m]==2){
                temp=a[h];
                a[h]=a[m];
                a[m]=temp;
                h--;
            }
            else{
                m++;
            }
        }
    }

    // Using Counting approach
    public void sort_012(int a[],int n){
        int arr[]=new int[3];
        for(int i=0;i<n;i++){
            if(a[i]==0){
                arr[0]++;
            }
            else if(a[i]==1){
                arr[1]++;
            }
            else{
                arr[2]++;
            }
        }
        int i=0;
        while(arr[0]>0){
            a[i++]=0;
            arr[0]--;
        }
        while(arr[1]>0){
            a[i++]=1;
            arr[1]--;
        }
        while(arr[2]>0){
            a[i++]=2;
            arr[2]--;
        }
    }
}
