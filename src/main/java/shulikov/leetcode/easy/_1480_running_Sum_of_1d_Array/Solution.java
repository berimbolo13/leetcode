package shulikov.leetcode.easy._1480_running_Sum_of_1d_Array;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 */
public class Solution {

    public int[] runningSum(int[] nums) {
        int inputLength = nums.length;
        int[] result = new int[inputLength];

        result[0] = nums[0];
        for (int i = 1; i < inputLength; i++) {
            result[i] = nums[i] + result[i - 1];
        }

        return result;
    }
}

