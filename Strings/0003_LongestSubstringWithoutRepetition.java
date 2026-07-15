import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, i);
            maxlen = Math.max(maxlen, i - left + 1);
        }
    return maxlen;
}
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
         System.out.println("enter the string ");
        String s = av.nextLine();
        System.out.println("the answer is="+ob.lengthOfLongestSubstring(s));
    }
}
