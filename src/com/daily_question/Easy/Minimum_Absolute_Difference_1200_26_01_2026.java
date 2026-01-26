package com.daily_question.Easy;
import java.util.*;
public class Minimum_Absolute_Difference_1200_26_01_2026 {

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};

        System.out.println(minimumAbsDifference(arr));

    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        List<List<Integer>> result = new ArrayList();
        int min  = Integer.MAX_VALUE;

        for(int i =0;i<n-1;i++){
            min = Math.min(min,Math.abs(arr[i+1] - arr[i]));
        }

        for(int i =0;i<n-1;i++){

            if(Math.abs(arr[i+1] -arr[i]) == min){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return result;
    }
}
