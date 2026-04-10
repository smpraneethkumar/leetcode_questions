package com.april.daily_questions_april;

import java.util.Arrays;

public class Minimum_distance_between_three_equal_elements_I_3740_10_4_26 {

    public static void main(String[] args) {

        int nums[] = {1,2,1,1,3};

        System.out.println(minimumDistance(nums));

    }
    public  static int minimumDistance(int[] nums) {


        int n = nums.length;

        Arrays.sort(nums);

        int min = -1;
        for(int i =0;i<n;i++){

            for(int j = 1;j<n;j++){

                for(int k =2;k<n;k++){

                    if(nums[i] == nums[j] || nums[i] == nums[k]){

                         min = Math.abs(i-j) + Math.abs(i-k) + Math.abs(k-i) ;

                         return min;
                    }
                }
            }
        }

        return min;





    }
}
