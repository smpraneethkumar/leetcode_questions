package com.daily_question.Medium;

import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_in_Array_1877_24_01_2026 {

    public static void main(String[] args) {
        int nums[] = {4,1,5,1,2,5,1,5,5,4};
        System.out.print(toSort(nums));
    }
   public  static int toSort(int[] nums){
        int n = nums.length;

//        for(int i =0;i<n;i++){
//            for(int j =0;j<n-i;j++){
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }

       Arrays.sort(nums);

       int ans = 0;
       for(int i =0;i<n/2;i++){
           int nums1 = nums[i];
           int nums2 = nums[n-i-1];
           int total = nums1 + nums2;
           ans = Math.max(ans,total);
       }

        return ans;
   }
}
