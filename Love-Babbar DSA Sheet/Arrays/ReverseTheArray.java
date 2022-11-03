/*Program to reverse an array after mth integer*/
import java.util.*;
public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ReverseTheArray obj=new ReverseTheArray();
        obj.reverseArray(list, 2);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int i,j,temp;
        for(i=m+1,j=arr.size()-1;i<j;i++,j--)
        {
            temp=arr.get(j);
            arr.set(j,arr.get(i));
            arr.set(i,temp);
        }
        for(i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
        System.out.println();
    }
}
