package com.daily_question.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_pair_removal_to_sort_array_I_3507_22_01_2026 {

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};

        System.out.println(minimumPairRemoval(nums));

    }
    public  static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int x : nums) list.add(x);

        int operations = 0;

        while(!isNonDecreasing(list)){

            int minsum = Integer.MAX_VALUE;
            int idx = 0;

            for(int i =0;i<list.size()-1;i++){
                int sum = list.get(i) + list.get(i+1);

                if(sum < minsum){
                    minsum = sum;
                    idx = i;
                }
            }

            list.set(idx,minsum);
            list.remove(idx+1);
            operations++;
        }

        return operations;
    }

    public static boolean isNonDecreasing(List<Integer> list){
        for(int i =1;i <list.size();i++){
            if(list.get(i) < list.get(i-1)) return false;
        }
        return true;

    }
}
