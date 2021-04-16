package shulikov.leetcode.easy._1822_sign_of_the_Product_of_an_Array;

/**
 * There is a function signFunc(x) that returns:
 * <p>
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 * <p>
 * Return signFunc(product).
 */
public class Solution {

    public int arraySign(int[] nums) {
        int product = 1;
        for (int i : nums) {
            product *= Integer.signum(i);
            if (product == 0) {
                break;
            }
        }
        return signFunc(product);
    }

    private int signFunc(int x) {
        return x;
    }
}

