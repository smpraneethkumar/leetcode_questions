package com.LEETCODE_CONTESTS.weekly_contests_492;

import java.util.Arrays;

public class Minimum_Operations_to_Sort_a_String_Q3 {

    public static void main(String[] args) {

        String s = "card";


        System.out.println(minOperations(s));

    }

    static int minOperations(String s){
int ans=0;
        char[] arr = s.toCharArray();

        for(int i =0;i<arr.length-1;i++){

            if(arr[i] > arr[i+1]){

//                swap
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp;

                ans++;
            }


        }

        if(ans ==0){
            return -1;
        }

        return  ans;
    }


}
