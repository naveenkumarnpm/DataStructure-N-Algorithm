import java.util.ArrayList;
import java.util.List;


class sumOfFactorialEqualToN {
    static int isPerfect(int N) {
        // code here
        int n=N;
        int num=0;

        List<Integer> list=new ArrayList<>();
        
        while(n!=0)
        {
         num=n%10;
         list.add(num);
         n=n/10;
        }
        int sum=0;
        
        for(int i:list)
        {
            sum+=factorial(i);
        }
        if(sum==N)
        {
            return 1;
        }
        return 0;
    }
    
    static int factorial(int i)
    {
        int num=1;
        while(i!=0)
        {
            num=num*i;
            i--;
        }
        return num;
    }

    public static void main(String args[])
    {
        System.out.println(" Sum Of Factorial of Number 145 is "+isPerfect(145));
    }
}