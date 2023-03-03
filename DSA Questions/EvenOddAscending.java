import java.io.*;
import java.util.*;

public class EvenOddAscending {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Long> even=new ArrayList<Long>();
        ArrayList<Long> odd=new ArrayList<Long>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            if(a[i]%2==0){
                even.add(a[i]);
            }
            else
                odd.add(a[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        for(int i=0;i<even.size();i++){
            a[i]=even.get(i);
        }
        for(int i=0;i<odd.size();i++){
            a[i+even.size()]=odd.get(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}