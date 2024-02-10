
/** https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article */
import java.util.*;

public class SmallestDistinctWindow {
    public int findSubString(String str) {
        // Your code goes here
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int n = str.length();
        if (n <= 1) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int dist_char = map.size();
        int start = 0;
        int[] count_char = new int[256];
        int count = 0, min_len = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            count_char[str.charAt(i)]++;
            if (count_char[str.charAt(i)] == 1) {
                count++;
            }
            if (count == dist_char) {
                while (count_char[str.charAt(start)] > 1) {
                    count_char[str.charAt(start)]--;
                    start++;
                }
                if (min_len > i - start + 1) {
                    min_len = i - start + 1;
                }
            }
        }
        return min_len;
    }
}