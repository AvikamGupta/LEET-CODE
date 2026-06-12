import java.util.*;
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int dig = x % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && dig > 7)) return 0;//if rev is already greater than MAX_VALUE/10, multiplying by 10 will overflow; 
                                                                                                // if rev equals MAX_VALUE/10, adding a digit greater than 7 will overflow (since MAX_VALUE ends in 7).
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && dig < -8)) return 0;//same logic for negative numbers — if rev is less than MIN_VALUE/10, multiplying by 10 will underflow; 
                                                                                                  // if rev equals MIN_VALUE/10, adding a digit less than -8 will underflow (since MIN_VALUE ends in -8
            rev = rev * 10 + dig;
            x /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("enter the number");
        int num = av.nextInt();
        System.out.println("reversed number is =" + ob.reverse(num));
    }
}
