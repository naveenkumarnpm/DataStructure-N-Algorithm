import java.util.HashMap;
import java.util.Map;

public class numberOddTimes {
    public static void main(String[] args) {
        
        int arr[]={20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        HashMap<Integer,Integer> elements=new HashMap<>(); 
        int element=0;
        for(int i=0;i<arr.length;i++)
        {
            element=arr[i];
            if(elements.get(element)==null)
            {
                elements.put(element,1);
            }else
            {
                elements.put(element,elements.get(element)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if(entry.getValue()%2==1)
            {
                System.out.println("element with odd number of times "+entry.getKey());
            }
        }
        

    }
}
