package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        //System.out.print(removeElement(new int[] {2,2,3}, 2));
        System.out.print(removeElementSolution(new int[] {2,2,3,4,2,5}, 2));
    }
    public static int removeElementOld(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }
        int temp = 0;
        if (counter < nums.length / 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
        return nums.length - counter;
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }

        int temp = 0;
        for (int i = 0; i < nums.length / 2 + 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == val) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        return nums.length - counter;
    }
    public static int removeElementSolution(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
