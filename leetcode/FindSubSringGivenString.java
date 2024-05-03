class FindSubSringGivenString {

    public static void main(String[] args) {
        System.out.println(strstr("abcabcabcd ","abcd"));
    }
    // Function to locate the occurrence of the string x in the string s.
    static int strstr(String s, String x) {
        int n = x.length();
        // Your code here
        if (s.contains(x)) {
            for (int i = 0; i < s.length() - n; i++) {
                System.out.println(s.substring(i, i + n));
                if (x.equals(s.substring(i, i + n))) {
                    return i;
                }
            }
        }
        return -1;
    }
}
