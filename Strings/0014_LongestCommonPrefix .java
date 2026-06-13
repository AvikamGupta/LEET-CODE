import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);//Arrays.sort(strs) sorts in alphabetical (lexicographic) order 
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("enter the no. of Words");
        int n = av.nextInt();
        av.nextLine(); 
        String arr[] = new String[n];
        System.out.println("enter words");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = av.nextLine();
        }
        System.out.println("longest common prefix is ");
        System.out.println(ob.longestCommonPrefix(arr));
    }
}
