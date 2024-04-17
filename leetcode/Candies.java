import java.util.ArrayList;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for (int j=0;j<candies.length;j++)
        {
            int sum=candies[j]+extraCandies;
            if(sum>=max)
            {
                list.add(j,true);
            }
            else{
                list.add(j,false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Candies candyChecker = new Candies();

        // Example input
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = candyChecker.kidsWithCandies(candies, extraCandies);

        // Printing the result
        System.out.println("Result:");
        for (boolean b : result) {
            System.out.println(b);
        }
    }
}
