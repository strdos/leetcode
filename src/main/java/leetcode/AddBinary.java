package leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.print(addBinary("110011", "1001"));
    }
    public static String addBinary(String a, String b) {

        StringBuilder builderA = new StringBuilder(a);
        StringBuilder reverseA = builderA.reverse();
        StringBuilder builderB = new StringBuilder(b);
        StringBuilder reverseB = builderB.reverse();
        StringBuilder sum = new StringBuilder();
        char carry = '0';
        StringBuilder longerString = reverseA.length() >= reverseB.length() ? reverseA : reverseB;
        StringBuilder shorterString = longerString.equals(reverseA) ? reverseB : reverseA;

        for (int i = 0; i < shorterString.length(); i++) {
           if (reverseA.charAt(i) == '0' && reverseB.charAt(i) == '0' && carry == '0') {
               sum.append('0');
           } else if ((reverseA.charAt(i) == '0' && reverseB.charAt(i) == '0' && carry == '1') ||
               (reverseA.charAt(i) == '0' && reverseB.charAt(i) == '1' && carry == '0') ||
               (reverseA.charAt(i) == '1' && reverseB.charAt(i) == '0' && carry == '0')) {
               sum.append('1');
               carry = '0';
           } else if ((reverseA.charAt(i) == '0' && reverseB.charAt(i) == '1' && carry == '1') ||
                (reverseA.charAt(i) == '1' && reverseB.charAt(i) == '0' && carry == '1') ||
                (reverseA.charAt(i) == '1' && reverseB.charAt(i) == '1' && carry == '0')) {
                sum.append('0');
                carry = '1';
            } else if (reverseA.charAt(i) == '1' && reverseB.charAt(i) == '1' && carry == '1') {
                sum.append('1');
            }
        }
        for (int i = shorterString.length(); i < longerString.length(); i++) {
            if (longerString.charAt(i) == '0' && carry == '0') {
                sum.append('0');
            }
            if (longerString.charAt(i) == '0' && carry == '1') {
                sum.append('1');
                carry = '0';
            }
            if (longerString.charAt(i) == '1' && carry == '0') {
                sum.append('1');
            }
            if (longerString.charAt(i) == '1' && carry == '1') {
                sum.append('0');
            }
        }
        if (carry == '1') {
            sum.append('1');
        }
        return sum.reverse().toString();
    }
}

/*
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
