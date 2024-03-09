import java.util.ArrayList;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many elements");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter a value for array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter how many elements to reverse");
        int k=sc.nextInt();
        System.out.println("values before");
        for(int ar:a)
        {
            System.out.print(ar);
        }
        System.out.println();

        while(k!=0){
            int temp=a[size-1];
            int i=size-2;
            while(i!=-1){
                a[i+1]=a[i];
                i--;
            }
            a[0]=temp;
            k--;
        }
        
        System.out.println();
        System.out.println("values after");
        for(int ar:a)
        {
            System.out.print(ar);
        }
        
        
        
    }
}
