/*Program to print duplicates and their count in a string */
import java.util.*;
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

    static void printDups(String str)
    {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
        if(count.containsKey(str.charAt(i)))
            count.put(str.charAt(i) , count.get(str.charAt(i))+1); 
        else
            count.put(str.charAt(i),1);
    	//increase the count of characters by 1 
        }

    	for (Map.Entry<Character,Integer> mapElement : count.entrySet()) { //iterating through the unordered map 
    	    if (mapElement.getValue() > 1) //if the count of characters is greater than 1 then duplicate found
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
        }
    }

    public static void main(String[] args) {
        duplicate("hello good evening, ");
    }
}
