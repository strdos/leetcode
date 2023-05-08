package leetcode;

import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
        //2,147,483,648
        System.out.print(reverse(1563847412));
    }
    public static int reverse(int x) {
        // check if zero
        if (x == 0) return 0;

        // check if negative
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        // remove ending zeroes
        while (x % 10 == 0) {
            x /= 10;
        }

        // split int into digits
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = x; i > 0; i /= 10) {
            digits.add(i % 10);
        }
        System.out.println(digits);

        // check for overflow, i.e. if the number is less than 2,147,483,647
        if (digits.size() == 10) {
            if (digits.get(0) > 2) {
                return 0;
            } else if (digits.get(0) == 2) {
                // check if the remaining number is less than 147,483,647 (checking 9 digits instead of 10 to avoid overflow)
                int temp = 0;
                for (int i = digits.size() - 1; i > 0; i--) {
                    temp += (int) (digits.get(i) * Math.pow(10, digits.size() - 1 - i));
                }
                if (temp > 147483647) {
                    return 0;
                }
            }
        }

        // turn digits into int
        int reversedX = 0;
        for (int i = digits.size() - 1; i >= 0 ; i--) {
            reversedX += (int) (digits.get(i) * Math.pow(10, digits.size() - 1 - i));
        }

        // add negative sign if needed
        return isNegative ? reversedX * - 1 : reversedX;
    }
    public int solution(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
 */
