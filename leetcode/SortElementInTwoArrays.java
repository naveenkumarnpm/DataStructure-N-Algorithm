import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class SortElementInTwoArrays {

    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        List<Long> set=new ArrayList<Long>();
       long i=0;
       long j=0;
       
       for(i=0,j=0;i<n || j<m;i++,j++)
       {
           if(i<n)
           {
               set.add(arr1[(int)i]);
           }
           if(j<m)
           {
               set.add(arr2[(int)j]);
           }
       }

       Collections.sort(set);

       int k=0;
       long w=0;
       long y=0;
       //int l=m-1;
       for(long x:set)
       {
           if(k<n)
           {
               arr1[(int)w++]=x;
               k++;
           }else{
               arr2[(int)y++]=x;
           }
       }

       for(i=0;i<n;i++)
       {
        System.out.println(arr1[(int)i]);
       }
       for(i=0;i<n;i++)
       {
        System.out.println(arr2[(int)i]);
       }
       
    }
    public static void main(String[] args) {
        long arr1[]={10,12};
        long arr2[]={5,18,20};

        merge(arr1,arr2,2,3);
    }
}
