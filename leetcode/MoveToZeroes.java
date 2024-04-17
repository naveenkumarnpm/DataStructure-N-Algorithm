public class MoveToZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int n = i;
                while (n < nums.length - 1 && nums[n + 1] == 0) {
                    n++;
                }
                if (n < nums.length - 1) {
                    int temp = nums[i];
                    nums[i] = nums[n + 1];
                    nums[n + 1] = temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(" "+nums[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={0,0,1};
        MoveToZeroes mz=new MoveToZeroes();
        mz.moveZeroes(arr);
    }
}
