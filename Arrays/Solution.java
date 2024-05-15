import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minElementsToRemove(ArrayList<Integer> arr) {

		// Write your code here
		List<Integer> list=new ArrayList<>();
		int count=0;
		for(int i:arr)
		{
			if(list.contains(i))
			{
				count++;
			}
			else{
				list.add(i);
			}
		}
		return count;
		
	}
}

//https://www.naukri.com/code360/problems/make-unique-array_920329?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=SUBMISSION