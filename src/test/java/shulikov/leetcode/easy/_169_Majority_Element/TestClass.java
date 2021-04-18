package shulikov.leetcode.easy._169_Majority_Element;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {
        int[] nums = {3,2,3};
        Assert.assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    public void example_2() {
        int[] nums = {2,2,1,1,1,2,2};
        Assert.assertEquals(2, solution.majorityElement(nums));
    }
}
