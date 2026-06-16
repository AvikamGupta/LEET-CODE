import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
            int uniqueCount = 1; // Start with the first element as unique
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[uniqueCount - 1]) {
                    nums[uniqueCount] = nums[i]; // Move the unique element to the correct position
                    uniqueCount++;
                }
            }
        return uniqueCount;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the size of the array:");
        int n = av.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = av.nextInt();
        }
        int k = ob.removeDuplicates(nums);
        System.out.println("The number of unique elements is: " + k);
    }
}
