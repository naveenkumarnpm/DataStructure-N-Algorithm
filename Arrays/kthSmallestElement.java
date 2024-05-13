import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class kthSmallestElement {

    public static void main(String[] args) {
        int arr[]={5,7,8,6,9,1,2};
        System.out.println(kthSmallest(arr,3));

    }
    public static int kthSmallest(int[] arr, int k) 
    { 
        //Your code here
        List<Integer> list = new ArrayList<Integer>();
        for (int num : arr) {
            list.add(num);
        }
        
        Collections.sort(list);
        return list.get(k-1);
    } 
}
