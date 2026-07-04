import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer gt=new StringTokenizer(s);
        String lastword="";
    while (gt.hasMoreTokens()) {
         lastword=gt.nextToken();
    }
   return lastword.length(); }
        public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob= new Solution();
       System.out.println("enter the String");
       String n1 = av.nextLine();
       System.out.println(ob.lengthOfLastWord(n1));
    }
}
