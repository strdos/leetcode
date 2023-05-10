package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1,4,4,0,3,0,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, 2);
            }
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

}

// entrySet() returns a set view of all entries
// for-each loop access each entry from the view
/*        for(Entry<String, Integer> entry: numbers.entrySet()) {
        System.out.print(entry);
        System.out.print(", ");
        }*/


/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */
