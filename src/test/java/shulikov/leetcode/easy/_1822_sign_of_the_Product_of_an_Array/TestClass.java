package shulikov.leetcode.easy._1822_sign_of_the_Product_of_an_Array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void example_1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        assertEquals(1, new Solution().arraySign(nums));
    }

    @Test
    public void example_2() {
        int[] nums = {1, 5, 0, 2, -3};
        assertEquals(0, new Solution().arraySign(nums));
    }

    @Test
    public void example_3() {
        int[] nums = {-1, 1, -1, 1, -1};
        assertEquals(-1, new Solution().arraySign(nums));
    }

    @Test
    public void example_4() {
        int[] nums = {41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
        assertEquals(-1, new Solution().arraySign(nums));
    }
}
