package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        System.out.print(getRow(9));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> values = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= rowIndex + 1 ; i++) {
            values = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    values.add(1);
                } else {
                    values.add(j, temp.get(j) + temp.get(j - 1));
                }
            }
            temp = values;
        }
        return values;
    }
}

/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33


Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 */
