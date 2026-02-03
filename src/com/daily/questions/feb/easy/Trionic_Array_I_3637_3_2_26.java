package com.daily.questions.feb.easy;

public class Trionic_Array_I_3637_3_2_26 {

    public static void main(String[] args) {

        int[] nums= {1,3,5,4,2,6};
        System.out.println(isTrionic(nums));
    }

    public static boolean isTrionic(int[] nums){
        int i =1;
        int n = nums.length;

        while(i<n && nums[i] > nums[i-1]){
            i++;
        }
        if(i == 1 || i==n){
            return  false;
        }

        while (i<n && nums[i] < nums[i-1]){
            i++;
        }
        if(i==n){
            return false;
        }

        while (i<n && nums[i] > nums[i-1]){
            i++;
        }


        return (i==n) ? true: false;
    }
}
