import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;   
            }
            digits[i] = 0;      
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("enter the number of digits for array");
        int n = av.nextInt();
        int digits[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < digits.length; i++) {
            digits[i] = av.nextInt();
        }
        int result[] = ob.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            int val = result[i];
            System.out.println(val);
        }
    }
}
