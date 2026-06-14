import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[k] = nums[index];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter no. of array elements:");
        int n = av.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = av.nextInt();
        }
        System.out.println("Enter value to remove:");
        int vari = av.nextInt();
        int k = ob.removeElement(arr, vari);  
        System.out.println("Elements after removal: " + Arrays.toString(Arrays.copyOf(arr, k)));
        System.out.println("Count of remaining elements (k): " + k);
    }
}
