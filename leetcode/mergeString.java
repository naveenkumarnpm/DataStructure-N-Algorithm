

public class mergeString {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder merged=new StringBuilder();
            int m=word1.length();
            int n=word2.length();
            for(int i=0,j=0;i<word1.length() || j<word2.length();i++,j++)
            {
                if(m!=0)
                {
                    merged.append(word1.charAt(i));
                    m--;
                }
                if(n!=0)
                {
                    merged.append(word2.charAt(j));
                    n--;
                }
    
            }
            return merged.toString();
    
        }

        public static void main(String args[])
        {
            mergeString ms=new mergeString();
            String word1="nav";
            String word2="kuma";
            System.out.println("result "+ms.mergeAlternately(word1,word2));
        }
}
