import java.util.Arrays;
public class time_complexity_ques3 {
    public void array_reverse(int a[]) // Time complexity: O(n)
    {
        for(int i=0;i<a.length/2;i++) // O(n/2)
        {
            int last_index=a.length-i-1; // O(1)
            int temp=a[i]; // O(1)
            a[i]=a[last_index]; // O(1)
            a[last_index]=temp;// O(1)
        }
        System.out.println(Arrays.toString(a));// O(1)
    }
    public static void main(String[] args) {
        time_complexity_ques3 o=new time_complexity_ques3();
        int [] arr={1,2,3,4,5};
        o.array_reverse(arr);
    }
}
