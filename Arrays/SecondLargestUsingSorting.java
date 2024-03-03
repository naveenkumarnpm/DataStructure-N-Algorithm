import java.util.Arrays;

public class SecondLargestUsingSorting {

public static int findSecondLargest(int arr[]){

    Arrays.sort(arr);

    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]!=arr[arr.length-1])
        {
            return arr[i];
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={2,3,7,5,4,6};
        int result=findSecondLargest(arr);
        System.out.println("second largest "+result);
    }
}
