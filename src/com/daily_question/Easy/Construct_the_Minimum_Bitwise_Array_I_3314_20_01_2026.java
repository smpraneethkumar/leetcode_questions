package com.daily_question.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Construct_the_Minimum_Bitwise_Array_I_3314_20_01_2026 {

    public static void main(String[] args) {

        List<Integer> nums=  new ArrayList<>();

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
            int og = nums.get(i);
            int candidate = -1;

            for(int j =1;j<og;j++){

                if((j | (j+1)) == og){
                    candidate = j;
                    break;
                }

            }
            ans[i] = candidate;
        }

        return ans;
    }
}
