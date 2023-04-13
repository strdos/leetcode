package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = getTwoSum(new int[]{1, 2, 3, 4, 5}, 9);
        System.out.println(Arrays.toString(result));
    }
        public static int[] getTwoSum ( int[] nums, int target){
            for (int i = 0; i < nums.length - 1; i++)
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            return new int[]{-1, -1};
        }
}
