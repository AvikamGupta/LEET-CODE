import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
       int first=0;
       int last=s.length()-1;
       while (first<last) {
        if(s.charAt(first)!=s.charAt(last))
        {
            return false;
        }
         first++;
         last--;
       }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest = "";
        for (int index = 0; index < s.length(); index++) {
            for (int j = index + 1; j <= s.length(); j++) {
                String substring = s.substring(index, j);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the string:");
        String s = av.nextLine();
        String result = ob.longestPalindrome(s);
        System.out.println("Longest palindromic substring: " + result);
    }
}
