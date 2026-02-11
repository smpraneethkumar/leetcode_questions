package com.daily.questions.feb.medium;


import java.util.HashSet;


public class Longest_Balanced_Subarray_I_3719_10_2_26 {
    public static void main(String[] args) {

        int nums[] = {3,2,2,5,4};


        System.out.println(longestBalanced(nums));
    }
    public static int longestBalanced(int[] nums) {

        int n =nums.length;
        int result = 0;
        for(int i =0;i<n;i++){
            HashSet <Integer> even = new HashSet<>();
            HashSet <Integer> odd = new HashSet<>();
            for(int j =i;j<n;j++){
                if(nums[j] % 2==0) even.add(nums[j]);
                else odd.add(nums[j]);
                if(even.size() == odd.size())result = Math.max(result,j-i+1);
            }
        }

        return result;
}
}
