/** Program that sorts an array consisting of 0,1 and 2 without using any sorting algo. */
class Array_sort_0_1_2
{
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
}
