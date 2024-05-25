import java.util.*;
import java.lang.*;

public class greeting {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string ");
       String s=sc.nextLine();
       System.out.println("The string is : "+s);

        

       //convert string to single charectar
       char[] str;
       
       str=s.toCharArray();
       System.out.print("The single chaarectars are : ");
       for(char c:str){
        System.out.print(c+" ");
       }
       System.out.println();


    //check for even charectars
    System.out.print("The even charectars extracted are : ");
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                 System.out.print(str[i]);
            }
        }
        System.out.println();


    // swapping the letter
    // if odd
        char[] strs=str;   //assigned to a new char array 
        System.out.print("The Swapped string is: ");
            for(int i=0;i<strs.length-1;i+=2){
                if (Character.isWhitespace(strs[i])) {
                    i+=1;
                }
                char temp=strs[i];
                strs[i]=strs[i+1];
                strs[i+1]=temp;
                //one mistake solved
            }
        System.out.println(strs);
        
        System.out.println(str);
    
            // toggle the letters
        char[] news=new char[str.length];
        for(int i=0;i<str.length;i++){
                if (Character.isUpperCase(str[i])){
                    news[i]=(char)(str[i]+32);
                }
                if (Character.isLowerCase(str[i])){
                    news[i]=(char)(str[i]-32);
                }
        }

        for(char ch:news)
            System.out.print(ch+"");
            

    }  
}
