import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {   
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();

        System.out.println("Enter size of array");
        int n1 = av.nextInt();

        int[] nums1 = new int[n1];               

        System.out.println("Enter array elements");
        for (int k = 0; k < n1; k++) {
            nums1[k] = av.nextInt();
        }

        System.out.println("Enter target");
        int target1 = av.nextInt();

        int[] result1 = ob.twoSum(nums1, target1);

        if (result1.length == 2)                 
            System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        else
               System.out.println("No solution found");
    }
}
            System.out.println("No solution found");
    }
}
