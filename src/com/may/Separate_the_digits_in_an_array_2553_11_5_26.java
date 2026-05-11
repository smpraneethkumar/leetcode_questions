package com.may;

import java.util.ArrayList;
import java.util.Arrays;

public class Separate_the_digits_in_an_array_2553_11_5_26 {

    public static void main(String[] args) {

     int [] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }
    public static int[] separateDigits(int[] nums) {

        int n = nums.length;;

        ArrayList<Integer>  list = new ArrayList<>();
        for(int num: nums){

            String val = String.valueOf(num);

            for(int j =0;j<val.length();j++) {
                list.add(val.charAt(j) - '0');
            }
        }
        int [] ans = new int[list.size()];
        for(int i =0;i< list.size();i++){
            ans[i] = list.get(i);
        }
return  ans;
    }
}
