import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;   
        int org = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;          
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return org == reversed;          
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        Scanner av = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not:");
        int a = av.nextInt();
        if (ob.isPalindrome(a)) {
            System.out.println("The number entered is a palindrome");
        } else {
            System.out.println("The number entered is not a palindrome");
        }
    }
}
