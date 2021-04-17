package shulikov.leetcode.medium._1302_Deepest_Leaves_Sum;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {

        TreeNode _1 = new TreeNode(1);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3);
        TreeNode _4 = new TreeNode(4);
        TreeNode _5 = new TreeNode(5);
        TreeNode _6 = new TreeNode(6);
        TreeNode _7 = new TreeNode(7);
        TreeNode _8 = new TreeNode(8);

        _1.left = _2;
        _1.right = _3;
        _2.left = _4;
        _2.right = _5;
        _4.left = _7;
        _3.right = _6;
        _6.right = _8;

        int result = solution.deepestLeavesSum(_1);
        Assert.assertEquals(15, result);
    }
}
