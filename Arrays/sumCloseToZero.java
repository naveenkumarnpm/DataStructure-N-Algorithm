public class sumCloseToZero {
    public static void main(String args[]) {
        int arr[] = { 1, 3, -5, 7, 8, 20, -40, 6 };

        int small=9999;
        int m=0,n=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum=arr[i]+arr[j];
                //System.out.println(sum);
                if(sum<small && sum>=0)
                {
                    small=sum;
                    m=i;
                    n=j;
                }
            }
        }

        System.out.println("small is "+small);
        System.out.println("n1 "+m+", n2 "+n);
    }
}
