package com.march.daily_question_march;

public class Special_Positions_in_a_Binary_Matrix_1582_4_3_26 {

    public static void main(String[] args) {

        int[][] mat= {
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };

        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        // O(m*n)
        // O(m+n)
        int rows[] = new int[m];
        int cols[] = new int[n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j]==1)
                {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        int ans = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(rows[i]==1 && cols[j]==1 && mat[i][j]==1)
                    ans++;
            }
        }

        return ans;
    }
}
