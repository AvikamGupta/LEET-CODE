import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int index = 0; index < s.length(); index++) {
            int first = map.get(s.charAt(index));
            int next  = (index + 1 < s.length()) ? map.get(s.charAt(index + 1)) : 0;

            if (first < next)
                ans -= first;
            else
                ans += first;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();

        System.out.println("Enter Roman number: ");
        String s = av.next().toUpperCase();

        System.out.println(ob.romanToInt(s));
    }
}
