import java.util.*;

class dup{
    public static void main(String[] args) {
        char s[]={'a','b','c','d','c','a'};
        Character[] ch=new Character[s.length];
        for (int i = 0; i < s.length; i++) {
            ch[i] = s[i];
        }
        Character[] uniq=Arrays.stream(ch).distinct().toArray(Character[]::new);
        char[] uni=new char[uniq.length];
        for(int i=0;i<uniq.length;i++){
            uni[i]=uniq[i];
        }
        System.out.println("The unique elements are");
        for(int i=0;i<uni.length;i++){
            System.out.print(uni[i]+" ");
        }


    }
}