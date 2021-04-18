package shulikov.leetcode.easy._53_Maximum_subarray;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currMaxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currMaxSum > maxSum) {
                maxSum = currMaxSum;
            }
            currMaxSum = Integer.max(currMaxSum + nums[i], nums[i]);
        }
        return Integer.max(maxSum, currMaxSum);
    }
}
