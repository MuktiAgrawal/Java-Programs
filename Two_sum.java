import java.util.Arrays;
public class Two_sum {
    public static void main(String[] args) {
        int num[]={2,7,11,15};
        Two_sum obj=new Two_sum();
        int result[]=obj.twoSum(num,17);
        System.out.println(Arrays.toString(result));
    }
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0,j=i+1;i<nums.length && j<nums.length;j++)
        {
            if((nums[i]+nums[j])==target)
            {
                return new int[] {i,j};
            }
            if(j==nums.length-1)
            {
                i++;
                j=i;
            }   
        }
        throw new IllegalArgumentException("No solution found");
    }
}