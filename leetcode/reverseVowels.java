

public class reverseVowels {
    public String reverseVowels(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                rev.append(c);
            }
        }

        int k = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                ch[i] = rev.charAt(k++);
            }
        }
        
        return new String(ch);
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        reverseVowels r = new reverseVowels();
        String val = "race car";
        String reuslt = r.reverseVowels(val);
        System.out.println(reuslt);
    }
}
