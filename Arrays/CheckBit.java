//https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

import java.util.ArrayList;

class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int val=0;
        int num=n;
        while(num>0)
        {
            val=num%2;
            list.add(val);
            num=num/2;
        }
        if(list.size()<=k)
        {
            return false;
        }
        
        
        if(list.remove(k)==1)
        {
            return true;
        }
        return false;
    }
    
}