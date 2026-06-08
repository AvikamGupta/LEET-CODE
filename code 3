import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = av.nextInt();
        int[] height = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            height[i] = av.nextInt();
        }

        Solution ob = new Solution();
        System.out.println("Max area = " + ob.maxArea(height));
    }
}
