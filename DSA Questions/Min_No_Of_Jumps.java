public class Min_No_Of_Jumps {
    // Brute force approach
    // Time complexity O(n*k)
    static int minJumps(int[] arr){
        int i=0;
        int count=0;
        while(i<arr.length-1){
            int k=arr[i];
            int max=Integer.MIN_VALUE;
            int index=0;
            if(i+k>=arr.length-1)
                return ++count;
            while(k>0){
                if(max<arr[i+k]){
                    max=arr[i+k];
                    index=i+k;
                }
                k--;
            }
            if(max==0){
                return -1;
            }
            else
                i=index;
            count++;
        }
    return count;
    }

    // Optimized approach
    static int minJumps1(int[] arr){
        // your code here
        int count=0,current=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,i+arr[i]);
            if(current >=arr.length-1)
            break;
            else if(max<=i) // it can only occur when one of the values in array is 0
            return -1;
            else if(i == current)
            {
                current=max;
                count++;
            }
        }
        return count;
    }
}
