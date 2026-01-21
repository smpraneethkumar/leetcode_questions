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
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            // even numbers cannot be formed
            if ((x & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            // find minimum j
            int j = x;
            while ((j | (j + 1)) != x) {
                j--;
            }

            ans[i] = j;
        }

        return ans;

    }
}
