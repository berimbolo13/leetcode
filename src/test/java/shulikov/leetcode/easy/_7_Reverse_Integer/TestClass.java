package shulikov.leetcode.easy._7_Reverse_Integer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {
        int x = 123;
        assertEquals(321, solution.reverse(x));
    }

    @Test
    public void example_2() {
        int x = -123;
        assertEquals(-321, solution.reverse(x));
    }

    @Test
    public void example_3() {
        int x = 120;
        assertEquals(21, solution.reverse(x));
    }

    @Test
    public void example_4() {
        int x = 0;
        assertEquals(0, solution.reverse(x));
    }

    @Test
    public void example_5() {
        int x = 1534236469;
        assertEquals(0, solution.reverse(x));
    }

    @Test
    public void example_6() {
        int x = -2147483412;
        assertEquals(-2143847412, solution.reverse(x));
    }

    @Test
    public void example_7() {
        int x = -2147483648;
        assertEquals(0, solution.reverse(x));
    }
}
