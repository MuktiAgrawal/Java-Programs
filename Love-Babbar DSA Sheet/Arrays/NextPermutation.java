import java.util.Arrays;
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int k=-1,i=nums.length-1;
        while(i>0){
            if(nums[i-1]<nums[i]){
                k=i-1;
                break;
            }
            i--;
        }
        if(k==-1){
            Arrays.sort(nums);
        }
        else{
            int j,min=Integer.MAX_VALUE,pos=-1;
            for(j=k+1;j<nums.length;j++){
                if(nums[j]>nums[k] && nums[j]<=min){
                    min=nums[j];
                    pos=j;
                }
            }
            nums[pos]=nums[k];
            nums[k]=min;
            int start=k+1,end=nums.length-1;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    }
}
