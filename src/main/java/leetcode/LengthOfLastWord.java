package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" ab c "));
    }
    public static int lengthOfLastWord(String s) {
        // String[] word = s.trim().split(" ");
        // return word[word.length - 1].length();


        // starting from the end, find first non-space character, then find first space
        int lastLetter, firstLetter;
        lastLetter = firstLetter = 0;

        // find last letter of last word
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lastLetter = i;
                break;
            }
        }

        // find first letter of last word
        for (int i = lastLetter; i >= 0 ; i--) {
            if (s.charAt(i) == ' ') {
                firstLetter = i + 1;
                break;
            }
        }

        return lastLetter - firstLetter + 1;
    }
}

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */
