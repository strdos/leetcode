package leetcode;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "ba"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;

        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        Arrays.sort(ransomNoteArray);
        Arrays.sort(magazineArray);
        int nextCharInMagazine = 0;
        int numOfMatchedChars = 0;
        boolean isMatch;

        for (int i = 0; i < ransomNoteArray.length; i++) {
            isMatch = false;
            for (int j = nextCharInMagazine; j < magazineArray.length; j++) {
                if (ransomNoteArray[i] == magazineArray[j]) {
                    nextCharInMagazine = j + 1;
                    numOfMatchedChars = i + 1;
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) return false;
        }
        return numOfMatchedChars == ransomNoteArray.length;
    }
}

/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.*/
