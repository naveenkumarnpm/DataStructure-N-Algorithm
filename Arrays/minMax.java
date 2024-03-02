import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int arr[]={5,1,6,4,3};

        Scanner scanner=new Scanner(System.in);

        int min=999;
        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("min "+min+" max "+max);

    }
}
