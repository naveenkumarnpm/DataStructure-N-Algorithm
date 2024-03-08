import java.util.ArrayList;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many elements");
        int size=sc.nextInt();

        System.out.println("enter a value for array");
        for(int i=0;i<size;i++)
        {
            int n=sc.nextInt();
            arr.add(n);
        }

        System.out.println("enter how many elements to reverse");
        int k=sc.nextInt();

        for(int a:arr)
        {
            System.out.println("values before"+a);
        }

        //int k=3;
        int j=0;
        for(int i=size-1;j!=k;j++)
        {
            int n=arr.get(i);
            arr.remove(i);
            arr.add(0,n);
        }
        
        System.out.println();

        for(int a:arr)
        {
            System.out.println("values after"+a);
        }
        
        
        
    }
}
