package com.daily_question.Medium;

import java.util.Arrays;

public class Maximize_area_of_square_hole_in_grid_2943_md_15_01_2026 {

    public static void main(String[] args) {
            int n =2;
            int m = 1;
            int []hBars = {2,3};
            int []vBars = {2};

        System.out.println(maximizeSquareHoleArea(n,m,hBars,vBars));
    }

    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int maxconsecutiveHbars = 1;
        int maxconsecutiveVbars = 1;

        int currconsecutiveHbars = 1;
        for(int i =1;i<hBars.length;i++){
            if(hBars[i] - hBars[i-1] == 1){
                currconsecutiveHbars++;
            }else{
                currconsecutiveHbars =1;
            }
            maxconsecutiveHbars = Math.max(maxconsecutiveHbars,currconsecutiveHbars);
        }

        int currconsecutiveVbars = 1;
        for(int i =1;i<vBars.length;i++){
            if(vBars[i] - vBars[i-1] == 1){
                currconsecutiveVbars++;
            }else {
                currconsecutiveVbars = 1;
            }
            maxconsecutiveVbars = Math.max(maxconsecutiveVbars,currconsecutiveVbars);
        }

        int side = Math.min(maxconsecutiveHbars,maxconsecutiveVbars) +1;

        return side*side;
    }
}
