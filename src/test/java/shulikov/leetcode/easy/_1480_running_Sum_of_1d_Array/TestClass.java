package shulikov.leetcode.easy._1480_running_Sum_of_1d_Array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestClass {

    @Test
    public void example_1() {
        int[] nums = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 3, 6, 10}, new Solution().runningSum(nums));
    }

    @Test
    public void example_2() {
        int[] nums = {1, 1, 1, 1, 1};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, new Solution().runningSum(nums));
    }

    @Test
    public void example_3() {
        int[] nums = {3, 1, 2, 10, 1};
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, new Solution().runningSum(nums));
    }

}
