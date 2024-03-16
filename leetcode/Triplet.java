package leetcode;

import java.util.Scanner;

public class Triplet {

    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3)
        {
            return false;
        }

        int smallest[]=new int[n];      
        int greatest[]=new int[n];

        smallest[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            smallest[i]=Math.min(smallest[i-1],nums[i]);
        }

        greatest[n-1]=nums[n-1];
        for(int i=nums.length-2;i>0;i--)
        {
            greatest[i]=Math.max(greatest[i+1],nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(smallest[i]<nums[i] && nums[i]<greatest[i])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Triplet triplet=new Triplet();
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("enter value for Array Length");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter a element for array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result=triplet.increasingTriplet(arr);
        System.out.println(result);
    }
}
