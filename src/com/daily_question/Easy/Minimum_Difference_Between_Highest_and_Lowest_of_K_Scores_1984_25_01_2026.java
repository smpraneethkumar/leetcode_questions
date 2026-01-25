package com.daily_question.Easy;

import java.util.Arrays;

public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores_1984_25_01_2026 {

    public static void main(String[] args) {

        int[] nums = {1,4,7,9};
        int k =2;

        System.out.println(minimumDifference(nums,k));

    }
    public static int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int l =0;
        int ans = Integer.MAX_VALUE;

        for(int r=0;r<nums.length;r++){

            if(r-l==k){
                l++;
            }

            if(r-l+1==k){

                int temp = nums[r] - nums[l];
                ans = Math.min(ans,temp);
            }

        }
        return ans;

    }
}
