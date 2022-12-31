/*Program to print duplicates and their count in a string */
public class duplicatesInString {
    public static void duplicate(String s){
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(count[i]>1){
                System.out.println((char)i+" = "+count[i]);
            }
        }
    }
    public static void main(String[] args) {
        duplicate("hello good evening, ");
    }
}
