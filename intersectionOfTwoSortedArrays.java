public class intersectionOfTwoSortedArrays {
    public static void intersection(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.print(a[i++]+" ");
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={5,6,7,8};
        intersection(a, b);
    }
}
