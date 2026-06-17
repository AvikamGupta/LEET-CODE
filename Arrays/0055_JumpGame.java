import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        int last_index = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index > last_index)
                return false;
            last_index = Math.max(last_index, index + nums[index]); 
            if (last_index >= nums.length - 1) 
                return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the size of the array:");
        int n = av.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = av.nextInt();
        }
        System.out.println(ob.canJump(arr));
    }
}
