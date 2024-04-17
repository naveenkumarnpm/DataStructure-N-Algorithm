public class substring {
    public boolean isSubsequence(String s, String t) {
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        int i=0;
        int count=0;
        for (int j=0;j<tt.length;j++) {
            if(ss[i]==tt[j])
            {
                i++;
                count++;
            }
        }
        if(count==ss.length)
        {
            return true;
        }
        return false;
    }
}
