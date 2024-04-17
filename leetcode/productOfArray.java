
import java.util.Scanner;

public class productOfArray {

    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];

        for(int i=0;i<result.length;i++)
        {
            result[i]=1;
        }

        int prefix=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=prefix;
            prefix*=nums[i];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=postfix;
            postfix*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter value for Array Length");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter a element for array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[n];

        productOfArray pr = new productOfArray();
        result = pr.productExceptSelf(arr);

        System.out.println("product of an array");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
