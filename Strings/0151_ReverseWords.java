import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer gt = new StringTokenizer(s);
        int n = gt.countTokens();
        String ss[] = new String[n];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = gt.nextToken();
        }
        String s2 = "";
        for (int i = ss.length - 1; i >= 0; i--) {
            s2 += ss[i];
            if (i != 0)
                s2 += " ";
        }
        return s2;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter string");
        String s = av.nextLine();
        String ans=ob.reverseWords(s);
        System.out.println(ans);
    }
}
