package com.april.daily_questions_april;

public class Minimum_distance_to_the_target_element_1848_13_4_26 {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        int taget = 5;
        int start = 3;

        System.out.println(getMinDistance(nums,taget,start));
    }

    public  static int  getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;
        int n = nums.length;


        for(int i =0;i<n;i++){

            if(nums[i] == target){
                int distance = Math.abs(i - start);
                minDistance = Math.min(minDistance, distance);


            }
        }
        return minDistance ;
    }
}
