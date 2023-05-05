package leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
        System.out.println(solutionMethod(2147483647));
    }
    public static int mySqrt(int x) {

        if (x < 2) return x;
        int result = 0;
        int start = Math.min(x / 2, 46340); // why not start at x / 2; cannot start at higher than 46340 as i * i in the for loop will result in Integer overflow

        for (int i = start; i > 0 ; i /= 2) {
            if (i * i == x) return i;
            if (i * i < x) {
                result = i;
                if (result == 46340) return result;
                break;
            }
        }
        for (int i = result; i * i <= x; i++) {
            result = i;
        }
        return result;
    }
    public static int solutionMethod(int x) {
        if((x==0)||(x==1)){
            return x;
        }

        int left = 0;
        int right = x;

        while(left <= right ){
            int middle = (left + right)/2;

            if (middle == x/middle){
                return middle;
            } else if (middle > x/middle){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return right;
    }

    /*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
     */
}
