package com.march.daily_question_march.medium;

import java.util.Arrays;

public class Equal_Sum_Grid_Partition_I_3546 {

    public static void main(String[] args) {

        int[][] grid = {
                {1,3},
                {2,4}
        };

        System.out.println(canPartitionGrid(grid));
    }

    static long[] rows;
     static long cols[];
    public  static boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        rows = new long[m];
        cols = new long[n];
        long sum = getSum(grid);
        // O(m*n)
        // O(m+n)
        // horizontal check
        long currsum = rows[0];
        for(int i=1; i<m; i++) {
            if(currsum==sum-currsum) {
                return true;
            }
            currsum += rows[i];
        }

        // vertical check
        currsum = cols[0];
        for(int j=1; j<n; j++) {
            if(currsum==sum-currsum) {
                return true;
            }
            currsum += cols[j];
        }

        return false;

    }

  static   long   getSum(int[][] grid) {
        long sum = 0;
        for(int i=0; i<grid.length; i++) {
            long rowsum = 0;
            for(int j=0; j<grid[0].length; j++) {
                sum += grid[i][j];
                rowsum += grid[i][j];
            }
            rows[i] = rowsum;
        }
        // colsum
        for(int j=0; j<grid[0].length; j++) {
            long colsum = 0;
            for(int i=0; i<grid.length; i++) {
                colsum += grid[i][j];
            }
            cols[j] = colsum;
        }

        return sum;
    }
}
