package com.daily_question.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Construct_the_Minimum_Bitwise_Array_II_3315_21_01_2026 {

    public static void main(String[] args) {

        List<Integer>  nums = new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);


        System.out.println(Arrays.toString(minBitwiseArray(nums)));
    }
    public static int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size();
        int [] ans = new int[n];

        for(int i =0;i<n;i++){
            int target = nums.get(i);
            int answer  = -1;
            int bitmask = 1;

            while((target & bitmask) != 0){
                answer =  target - bitmask;
                bitmask <<=1;

            }
            ans[i] = answer;
        }



        return ans;

    }
}
