import java.util.*;
class Solution {
     boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
        public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob= new Solution();
       System.out.println("enter the number");
       int n1 = av.nextInt();
       System.out.println(ob.isPowerOfTwo(n1));
    }
}
