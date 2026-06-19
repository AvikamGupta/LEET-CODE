import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int x = 0;
        for (int index = 0; index < nums.length; index++) {
            int count = 0;          
            int num = Math.abs(nums[index]); 
            if (num == 0) {
                count = 1;           
            } else {
                while (num > 0) {
                    count++;
                    num = num / 10;
                }
            }
            if (count % 2 == 0)
                x++;
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
        System.out.println(ob.findNumbers(arr));
    }
}
