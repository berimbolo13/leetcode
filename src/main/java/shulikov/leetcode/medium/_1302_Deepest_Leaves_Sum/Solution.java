package shulikov.leetcode.medium._1302_Deepest_Leaves_Sum;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 */
public class Solution {
    public int deepestLeavesSum(TreeNode root) {

        List<TreeNode> deepestLeaves = Collections.singletonList(root);
        List<TreeNode> nextLevel = deepestLeaves;
        while (nextLevel.size() != 0) {
            deepestLeaves = nextLevel;
            nextLevel = findNextLevel(deepestLeaves);
        }
        return deepestLeaves.stream().map(node -> node.val).reduce(0, Integer::sum);
    }

    private List<TreeNode> findNextLevel(List<TreeNode> nodes) {
        List<TreeNode> result = new LinkedList<>();
        for (TreeNode node : nodes) {
            if (node.left != null) {
                result.add(node.left);
            }
            if (node.right != null) {
                result.add(node.right);
            }
        }

        return result;
    }
}