import java.util.*;

class Solution {
    public String intToRoman(int num) {
        int nums[]   = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String sym[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder str = new StringBuilder();
        for (int index = 0; index < nums.length; index++) {
            while (num >= nums[index]) {
                str.append(sym[index]);
                num -= nums[index];
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a number (1 - 3999): ");
        int n = av.nextInt();

        if (n < 1 || n > 3999) {
            System.out.println("Wrong input! Roman numerals only support 1 to 3999.");
            return;
        }

        System.out.println(n + " → " + sol.intToRoman(n));
    }
}
