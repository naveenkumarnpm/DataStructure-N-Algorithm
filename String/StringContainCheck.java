package String;
public class StringContainCheck {

    public String gcdOfStrings(String string1, String string2) {
        if(!(string1+string2).equals(string2+string1))return "";
        int gcdval=gcd(string1.length(),string2.length());
        return string2.substring(0,gcdval);

    }
    public int gcd(int x,int y)
        {
            if(y==0) 
                return x;
            else 
                return gcd(y,x%y);
        }


    public static void main(String args[])
        {
            StringContainCheck ms=new StringContainCheck();
            String word1="navnavnav";
            String word2="navnav";
            System.out.println("result "+ms.gcdOfStrings(word1,word2));
        }
}
