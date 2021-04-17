package shulikov.leetcode.easy._7_Reverse_Integer;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Solution {

    // TODO Handle overflow
    public int reverse(int x) {
        int result = 0;
        for (; x != 0; x /= 10) {
            int digit = x % 10;
            result = result * 10 + digit;
        }
        return result;
    }
}

