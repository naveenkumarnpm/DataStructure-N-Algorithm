import java.util.Arrays;

public class MaxNumberOfKNumberPairs {
    public int maxOperations(int[] nums, int k) {
        int i =0;
        int j=nums.length-1;
        int count=0;

        Arrays.sort(nums);
        
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return count;

        
    }
    public static void main(String[] args) {
        MaxNumberOfKNumberPairs mx=new MaxNumberOfKNumberPairs();
        int nums[]={1,2,3,4};
        int k=5;
        System.out.println(mx.maxOperations(nums, k));
    }
}
