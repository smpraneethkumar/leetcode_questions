package com.daily.questions.feb.easy;

public class Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I_3010_1_2_26 {

    public static void main(String[] args) {

        int [] nums = {1,2,3,12};
        System.out.println(minimumCost(nums));

    }
    public static int minimumCost(int[] nums) {


        // int firstMin = nums[0];
        int n = nums.length;
        int first = Integer.MAX_VALUE;
        // int secMin = Integer.MAX_VALUE;
        for (int i = 1; i <= n - 2; i++) {

            for (int j = i + 1; j <= n - 1; j++) {
                int cost = nums[0] + nums[i] + nums[j];
                first = Math.min(first, cost);
            }
        }

        return first;

    }
}
