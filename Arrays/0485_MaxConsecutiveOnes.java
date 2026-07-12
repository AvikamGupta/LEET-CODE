import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int x=0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            x=Math.max(x,count);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the size of array");
        int n1 = av.nextInt();
        int arr[]=new int[n1];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=av.nextInt();
        }
        System.out.println("Max consecutive ones: " + ob.findMaxConsecutiveOnes(arr));
    }
}
