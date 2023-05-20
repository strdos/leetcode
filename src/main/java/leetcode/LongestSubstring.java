package leetcode;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(solution("pwwkew"));
/*        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("jbpnbwwd"));*/
    }
    public static int lengthOfLongestSubstringUsingSet(String s) {
        if (s.isEmpty()) return 0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i > maxLength) {
                for (int j = i; j < s.length(); j++) {
                    if (!set.contains(s.charAt(j))) {
                        set.add(s.charAt(j));
                        maxLength = Math.max(maxLength, set.size());
                    } else {
                        set.clear();
                        break;
                    }
                }
            }
        }
        return maxLength;
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        List<Character> list = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i > maxLength) {
                for (int j = i; j < s.length(); j++) {
                    if (!list.contains(s.charAt(j))) {
                        list.add(s.charAt(j));
                        maxLength = Math.max(maxLength, list.size());
                    } else {
                        list.clear();
                        break;
                    }
                }
            }
        }
        return maxLength;
    }
    public static int solution(String s) {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
/*
Given a string s, find the length of the longest
substring
 without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
