import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class meadianOfArrayElements {

    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        List<Integer> list=new ArrayList<Integer>();
       int i=0;
       int j=0;
       
       for(i=0,j=0;i<n || j<m;i++,j++)
       {
           if(i<n)
           {
               list.add(a[i]);
           }
           if(j<m)
           {
               list.add(b[j]);
           }
       }
       Collections.sort(list);
       
       int size=list.size();
       if(size%2==0)
       {
           int pos=(size)/2;
           double ans1=list.get(pos);
           double ans2=list.get(pos-1);
           double ans3=(ans1+ans2)/2;
           return ans3;
       }else{
        int pos=(size)/2;
        return list.get(pos);
       }
       
    }
    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4};

        double val=medianOfArrays(2,2,arr1,arr2);
        System.out.println(val);
    }
}
