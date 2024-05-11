import java.util.HashSet;

import java.util.Set;

public class setMapCollection {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        
        //adding a element
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);

        for(int i:set)
        {
            System.out.println(i);
        }


    }
}
