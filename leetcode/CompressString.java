import java.util.Scanner;

public class CompressString {
    public int compress(char[] chars) {
        int index = 0;
        char ch = chars[0]; // Initialize ch with the first character
        int count = 1;
        
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = ch;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                if (i < chars.length) {
                    ch = chars[i];
                    count = 1;
                }
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println(); // Add a newline after printing compressed characters
        
        return index;
    }

   










        // int index=0;
        // char ch=' ';
        // int count=1;
        // String size="";
        // for(int i=1;i<chars.length;i++)
        // {
        //     if(chars[i]==chars[i-1])
        //     {
        //         ch=chars[i];
        //         count++;
        //     }else{
        //         chars[index]=ch;
        //         index++;
        //         chars[index]=(char)count;
        //         size=size+count;
        //         if(size.length()>1)
        //         {
        //             int n=0;
        //             while(n!=size.length())
        //             {
        //                 chars[index]=size.charAt(n);
        //                 index++;
        //                 n++;
        //             }
        //         }
                
        //     }
        // }for(int i=0;i<chars.length;i++)
        // {
        //     System.out.println("char after "+chars[i]);
        // }
        
        // return index;
    

    public static void main(String[] args) {
        
        System.out.println("enter a how many elements");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=scanner.next().charAt(0);
        }

        CompressString cs=new CompressString();
        int i=cs.compress(ch);
        System.out.println("the value is "+i);
    }
}