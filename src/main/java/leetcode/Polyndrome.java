package leetcode;

import java.util.ArrayList;

public class Polyndrome {
    public static void main(String[] args) {
        int number = 1001001001;
        System.out.println(isPalindrome(number));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int originalX = x;
        int reversedX = 0;
        int i = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(i, x % 10);
            System.out.println(digits.get(i) + "original");
            x /= 10;
            i++;
        }
        for (int j = digits.size() - 1; j >= 0; j--) {
            reversedX = reversedX + digits.get(digits.size() - j - 1) * (int)Math.pow(10, j);
            System.out.println(reversedX + "reversed");
        }
        return originalX == reversedX;
    }
}

