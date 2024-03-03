public class missingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7}; //Need not to be sorted
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arrSum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            arrSum+=arr[i];
        }

        int missingNum=sum-arrSum;
        System.out.println(missingNum);
    }
}

