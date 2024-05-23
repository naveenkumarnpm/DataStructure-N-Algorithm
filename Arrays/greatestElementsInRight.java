import java.util.ArrayList;

public class greatestElementsInRight {
    public static void main(String args[]) {
        int arr[] = { 31, 40, 93, 40, 98 };
        leaders(arr);
    }

    public static ArrayList<Integer> leaders(int arr[]) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i]+" = "+arr[j]);
                if (arr[i] >= arr[j]) {
                    max = arr[i];
                } else {
                    System.out.println(arr[i]+" = "+arr[j]);
                    max = arr[j];
                    break;
                }
            }
            if (max == arr[i]) {
                System.out.println("testing max  value "+max);
                list.add(arr[i]);
            }
           

        }
        list.add(arr[arr.length-1]);
        for (int i : list) {
            System.out.println(i);
        }
        return list;

    }
}
