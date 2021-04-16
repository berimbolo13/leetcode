package shulikov.leetcode.easy._1108_Defanging_an_IP_Address;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {
        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr(address));
    }

    @Test
    public void example_2() {
        String address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr(address));
    }

}
