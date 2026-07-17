import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int ar2[]=new int[nums.length];
        int j=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            ar2[i]=sum;
        }
        return ar2;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
         System.out.println("enter the size of array");
        int n=av.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=av.nextInt();
        }
        int result[]=ob.runningSum(ar);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
