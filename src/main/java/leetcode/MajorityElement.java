package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
                int curValue = map.getOrDefault(num, 0);
                map.put(num, curValue + 1);
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int solution(int[] nums) {
        int res = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > res) {
                return num;
            }
        }
        return res;
    }
}

/*

map.put(new Integer(1 + i.getValue()))

int count = freq.containsKey(word) ? freq.get(word) : 0;
freq.put(word, count + 1)
 */


/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
 */
