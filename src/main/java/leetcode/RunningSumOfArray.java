package leetcode;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, -2};
        System.out.println(Arrays.toString(runningSum((nums))));
    }
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
