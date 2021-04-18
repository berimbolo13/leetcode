package shulikov.leetcode.easy._169_Majority_Element;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
class Solution {
    public int majorityElementWithHashMap(int[] nums) {
        int halfSize = nums.length / 2;
        Map<Integer, Integer> entryMap = new HashMap<>();
        for (int num : nums) {
            int entryCount = entryMap.getOrDefault(num, 0) + 1;
            if (entryCount > halfSize) {
                return num;
            }
            entryMap.put(num, entryCount);
        }
        throw new RuntimeException("Majority element doesn't exist");
    }

    /**
     * Boyer-Moore Voting
     */
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (majorityElement == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = nums[i];
                    count++;
                }
            }
        }
        return majorityElement;
    }
}