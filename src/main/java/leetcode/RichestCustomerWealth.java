package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[2][3];
        accounts[0][0] = 1;
        accounts[0][1] = 2;
        accounts[0][2] = 3;
        accounts[1][0] = 1;
        accounts[1][1] = 2;
        accounts[1][2] = 7;
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        // iterate over 1D
        // get sum of 2D
        // get max of 2D
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                customerWealth += accounts[i][j];
            }
            if (maxWealth < customerWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}

/*Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.*/
