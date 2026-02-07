package com.daily.questions.feb.medium;

import java.util.Arrays;

class Minimum_removals_to_balance_Arrays_3634_6_2_26 {


    public static void main(String[] args) {
        int nums[] = {2,1,5};
        int k = 2;
        System.out.println(minRemoval(nums,k));
    }
    public  static int minRemoval(int[] nums, int k) {
        
        int n = nums.length;
        Arrays.sort(nums);

        int L = 1;

        long maxEl = nums[0];
        long minEl = nums[0];
        int i =0;
        int j =0;

        while(j<n){
            minEl = nums[i];
            maxEl = nums[j];

            while( i< j && maxEl > k*minEl){
                i++;
                minEl = nums[i];
            }   
             L = Math.max(L,j-i+1);
             j++;             
        }
        return n-L;
    }
}