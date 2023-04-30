package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rows = new ArrayList<>(); // external list

        for (int i = 1; i <= numRows; i++) {
            List<Integer> values = new ArrayList<>(); // internal list, new for each row
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    values.add(1); // as first and last values in all rows are equal to 1
                } else {
                    values.add(j, rows.get(i - 2).get(j) + rows.get(i - 2).get(j-1)); // adding values from previous row, same index and index - 1; i-2 as loop starts from i = 1
                }
            }
            rows.add(values);
        }
        return rows;
    }

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

1 <= numRows <= 30
     */
}
