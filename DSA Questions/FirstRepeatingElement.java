import java.util.HashSet;
public class FirstRepeatingElement {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set=new HashSet<Integer>();
        int min=-1;
        for(int i=n-1;i>=0;i--){
            if(set.contains(arr[i])){
                min=i+1;
            }
            set.add(arr[i]);
        }
        return min;
    }
}
