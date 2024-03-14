package leetcode;

public class ReverseWords {

    public String reverseWords(String s) {
        String StrArr[]=s.split(" ");
        
        int start=0;
        int end=StrArr.length-1;
        
        while(start<end)
        {
            String temp=StrArr[start];
            StrArr[start]=StrArr[end];
            StrArr[end]=temp;
            start++;
            end--;
        }

        int indexOfSpace = -1;
        for (int i = 0; i < StrArr.length; i++) {
            if (StrArr[i].contains(" ")) {
                indexOfSpace = i;
                break;
            }
        }

        // If space is found, remove it
        if (indexOfSpace != -1) {
            StrArr[indexOfSpace] = StrArr[indexOfSpace].replace(" ", "");
        }


        return String.join(" ", StrArr).trim();
        //return s;
    }

    public static void main(String[] args) {
        String s="hii my name is   naveen";
        ReverseWords revw=new ReverseWords();
        revw.reverseWords(s);
        System.out.println(revw.reverseWords(s));
    }
    
}
