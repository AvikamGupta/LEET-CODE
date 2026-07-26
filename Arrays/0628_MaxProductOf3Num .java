class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        long product1 = (long) nums[n-1] * nums[n-2] * nums[n-3];
        long product2 = (long) nums[0] * nums[1] * nums[n-1];

        return (int) Math.max(product1, product2);
    }
}
