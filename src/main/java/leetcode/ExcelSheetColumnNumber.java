package leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String s = "ABA";
        System.out.println(titleToNumber(s));
    }
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >= 0 ; i--) {
            int diff = columnTitle.charAt(i) - 'A';
            //System.out.println("i: " + i);
            //System.out.println("diff: " + diff);
            //sum += diff * Math.pow(26, columnTitle.length() - i - 1);
            //sum += Math.pow(26, columnTitle.length() - i - 1);
            sum += (Math.pow(26, columnTitle.length() - i - 1)) * (diff + 1);
        }
        return sum;
    }
}

/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

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

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701


Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].

 */
