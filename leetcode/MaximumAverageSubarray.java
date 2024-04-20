public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }

        double avg=(double)sum/k;

        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            avg=Math.max(avg,sum/(double)k);

        }

        return avg;
    }
    
    public static void main(String args[])
    {
        MaximumAverageSubarray mx=new MaximumAverageSubarray();
        int arr[]={1,12,-5,-6,50,3};

        System.out.println(mx.findMaxAverage(arr,4));
    }
}
