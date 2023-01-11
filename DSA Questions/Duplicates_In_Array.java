import java.util.ArrayList;
public class Duplicates_In_Array {
    public static ArrayList<Integer> duplicates(int[] arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arr[arr[i]%arr.length]=arr[arr[i]%arr.length]+arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr.length*2){
                ls.add(i);
            }
        }
        if(ls.size()<=0){
            ls.add(-1);
        }
        return ls;
    }
    public static void main(String[] args) {
        int a[]={4,5,2,1,0,3};
        System.out.println(duplicates(a));
    }
}
