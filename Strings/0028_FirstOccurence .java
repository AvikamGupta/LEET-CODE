import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
         return haystack.indexOf(needle);} //String.indexOf() does exactly what's needed — it returns the index of the first occurrence of needle, or -1 if not found.
        public static void main(String[] args) {                                                                  
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the haystack string:");
        String haystack = av.nextLine();
        System.out.println("Enter the needle string:");
        String needle = av.nextLine();
        int result = ob.strStr(haystack, needle);
        System.out.println("Index of the first occurrence of the needle in the haystack: " + result);
    }
}
