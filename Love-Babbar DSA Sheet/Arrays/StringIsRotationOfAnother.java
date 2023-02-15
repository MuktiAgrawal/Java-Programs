import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class StringIsRotationOfAnother {
    // Approach 1
    // Worst case complexity: O(n^2)
    // Space complexity: O(1)
    public static boolean rotatedString(String s1,String s2){
        char first=s1.charAt(0);
        int len=s2.length();
        if(s1.length()!=len){
            return false;
        }
        ArrayList<Integer> indexes=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(first==s2.charAt(i)){
                indexes.add(i);
            }
        }
        for(int idx:indexes){
            int j=idx;
            int i;
            for(i=0;i<len;i++){
                if(s2.charAt((j+i)%len)!=s1.charAt(i)){
                    break;
                }
            }
            if(i==len){
                return true;
            }
        }
        return false;
    }

    // Approach 2

    public static boolean rotatedString2(String s1,String s2){
        return ((s1+s1).indexOf(s2)!=-1 && s1.length()==s2.length());
    }

    // Approach 3
    public static boolean rotatedString3(String s1,String s2){
        Queue<Character> q1=new LinkedList<Character>();
        Queue<Character> q2=new LinkedList<Character>();
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            q1.add(s1.charAt(i));
            q2.add(s1.charAt(i));
        }
        for(int i=0;i<s1.length();i++){
            if(q1.equals(q2)){
                return true;
            }
            else{
                char ch=q2.peek();
                q2.remove();
                q2.add(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotatedString3("rotationstring","ringrotationst"));
    }
}
