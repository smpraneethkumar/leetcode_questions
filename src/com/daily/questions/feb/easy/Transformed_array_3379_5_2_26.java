package com.daily.questions.feb.easy;

import java.util.Arrays;

public class Transformed_array_3379_5_2_26 {
    public static void main(String[] args) {
        int nums[] = {-1,4,-1};
//int n = nums.length;
//        System.out.println(n);
//        System.out.println(nums[n-1]);

        System.out.println(Arrays.toString(constructTransformedArray(nums)));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];


        int n = nums.length;
        for(int i =0;i<n;i++){
            int shift = nums[i]%n;
            int newInd = (i+shift)%n;

            if(newInd < 0){
                newInd += n;
            }
            result[i] = nums[newInd];


        }

        return result;
}
}

