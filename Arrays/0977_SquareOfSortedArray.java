import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
       return nums;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter Size of array");
        int n=av.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=av.nextInt();
        }
        int result[]=ob.sortedSquares(arr);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
