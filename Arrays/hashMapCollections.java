import java.util.HashMap;

import java.util.Map;

public class hashMapCollections {
    public static void main(String args[])
    {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int arr[]={1,5,7,6,5,1,7,9,5,1,4,3,5,7,9};

        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(int i:arr)
        {
            int key=map.get(i);
            System.out.println("value "+i+" key "+key);
        }


    }
}
