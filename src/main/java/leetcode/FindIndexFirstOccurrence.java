package leetcode;

public class FindIndexFirstOccurrence {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
            }
        }
        return -1;
    }
    public static int solution(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static int solutionShortest(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */
