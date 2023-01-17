import java.util.Map;
import java.util.HashMap;
public class FirstNonRepeating {
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }  
}
