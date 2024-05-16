import java.util.* ;
import java.io.*; 
public class firstNonRepeatingCharacter {

	public static char firstNonRepeatingCharacterr(String str) {

		Map<Character,Integer> map=new HashMap<Character,Integer>();
			
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int fe=map.get(ch);
			if(fe==1)
			{
				return ch;
			}
		}
		 return str.charAt(0);
	}
}

//https://www.naukri.com/code360/problems/first-non-repeating-character_920324?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=SUBMISSION