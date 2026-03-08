package com.march.daily_question_march.medium;

public class Find_Unique_Binary_String_1980_8_3_26 {

    public static void main(String[] args) {

        String[] num = {"01","10"};

        System.out.println(findDifferentBinaryString(num));
    }
    public static String findDifferentBinaryString(String[] nums) {

        int n = nums.length;

        StringBuilder sb = new StringBuilder();

        for(int i =0;i<n;i++){

            char flip = nums[i].charAt(i) == '0' ? '1' :'0';

            sb.append(flip);
        }

        return sb.toString();
    }
}
