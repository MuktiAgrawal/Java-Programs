/** Problem link: https://leetcode.com/problems/merge-intervals/description/ */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Interval_Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        List<int []> ls=new ArrayList<int []>();
        int temp[]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(temp[1]>=intervals[i][0]){
                temp[0]=Math.min(temp[0],intervals[i][0]);
                temp[1]=Math.max(temp[1],intervals[i][1]);
            }
            else{
                ls.add(temp);
                temp=intervals[i];
            }
        }
        ls.add(temp);
        // int array[][]=new int[ls.size()][2];
        // for(int i=0;i<array.length;i++){
        //     array[i]=ls.get(i);
        // }
        
        return ls.toArray(new int[0][]);
        // will store elements of list to a 2-D integer array as specified in above statement and the number of rows are set to 0 so that if the size of list is more than that, it is automatically expanded to that size and type of data structure stays the same
    }
}