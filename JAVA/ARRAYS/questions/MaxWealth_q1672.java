package ARRAYS.questions;

public class MaxWealth_q1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1},
                {6,7,8}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        // person = row and account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new column, take a new sum for that row
            int rowsum = 0;
            for (int anInts : ints) {
                rowsum += anInts;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (ans < rowsum) {
                ans = rowsum;
            }
        }
        return ans;
    }
}
