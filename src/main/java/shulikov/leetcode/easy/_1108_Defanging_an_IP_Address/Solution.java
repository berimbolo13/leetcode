package shulikov.leetcode.easy._1108_Defanging_an_IP_Address;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 */
public class Solution {

    public String defangIPaddr(String address) {
        char[] addressCharArray = address.toCharArray();
        char[] defangedIpAddrArray = new char[addressCharArray.length + 6];

        for (int i = 0, j = 0; i < addressCharArray.length; i++, j++) {
            if (addressCharArray[i] == '.') {
                defangedIpAddrArray[j] = '[';
                defangedIpAddrArray[++j] = '.';
                defangedIpAddrArray[++j] = ']';
            } else {
                defangedIpAddrArray[j] = addressCharArray[i];
            }
        }
        return String.copyValueOf(defangedIpAddrArray);
    }
}

