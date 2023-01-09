import java.util.HashMap;
public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(k-arr[i])){
                count+=hmap.get(k-arr[i]);
            }
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i],hmap.get(arr[i])+1);
            else
                hmap.put(arr[i],1);
        }
        return count;
    }
}
