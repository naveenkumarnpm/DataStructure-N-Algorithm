import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("enter to number to find a prime number");
        n=sc.nextInt();

        if(n<=1)
        {
            System.out.println("not prime");
            return;
        }
        if(n==2 || n==3)
        {
            System.out.println("Prime number");
            return;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("not Prime");
                return;
            }
        }
        System.out.println("number "+n);
        System.out.println("prime number");

    }
}
