package leetcode;

import java.util.ArrayList;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(6589245));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = columnNumber; i > 0 ; i /= 26) {
            if (i % 26 == 0) {
                sb.append('Z');
                i -= 1;
            } else {
                sb.append((char)('A' + (i % 26) - 1));
            }
        }
        return sb.reverse().toString();
    }

    public static String convertTo26(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0 ; i /= 26) {

            if (i % 26 == 0) {
                //digits.add(26);
                sb.append('Z');
                i -= 1;
            } else {
                //digits.add(i % 26);
                sb.append((char)('A' + (i % 26) - 1));
            }
        }
        System.out.println(digits);
/*

        for (int i = 0; i < digits.size(); i++) {
            sb.append((char)('A' + digits.get(i) - 1));
        }
        System.out.println(sb.toString());*/
        return sb.reverse().toString();
    }


}
/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"


Constraints:

1 <= columnNumber <= 231 - 1
 */
