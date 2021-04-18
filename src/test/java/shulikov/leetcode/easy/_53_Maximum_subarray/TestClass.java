package shulikov.leetcode.easy._53_Maximum_subarray;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, solution.maxSubArray(nums));
    }

    @Test
    public void example_2() {
        int[] nums = {1};
        Assert.assertEquals(1, solution.maxSubArray(nums));
    }

    @Test
    public void example_3() {
        int[] nums = {5, 4, -1, 7, 8};
        Assert.assertEquals(23, solution.maxSubArray(nums));
    }

    @Test
    public void example_4() {
        int[] nums = {-1};
        Assert.assertEquals(-1, solution.maxSubArray(nums));
    }
}
