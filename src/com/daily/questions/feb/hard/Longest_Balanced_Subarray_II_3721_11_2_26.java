package com.daily.questions.feb.hard;

import java.util.HashMap;

public class Longest_Balanced_Subarray_II_3721_11_2_26 {

    public static void main(String[] args) {
        int nums[] = {2,5,4,3};

        System.out.println(longestBalanced(nums));
    }
    public static int longestBalanced(int[] nums) {
        // int n =nums.length;
        // int result = 0;
        // for(int i =0;i<n;i++){
        //     Set <int> even = new HashSet<>();
        //     Set <int> odd = new HashSet<>();
        //     for(int j =i;j<n;j++){
        //         if(nums[j] % 2==0) even.add(nums[j]);
        //         else odd.add(nums[j]);
        //         if(even.size() == odd.size())result = Math.max(result,j-i+1);
        //     }
        // }

        // return result;


        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        SegmentTree st  = new SegmentTree(n);

        int maxLen = 0;

        for(int i =0;i<n;i++){
            int val = (nums[i]%2==0) ? 1: -1;
            if(hm.containsKey(nums[i])){
                int prev = hm.get(nums[i]);
                st.update(1,0,n-1,0,prev,-val);
            }
            st.update(1,0,n-1,0,i,val);

            hm.put(nums[i],i);

            int left = st.getLeftMost(1,0,n-1);
            if(left!=-1 && left <= i){
                maxLen = Math.max(maxLen,i-left+1);
            }
        }
        return maxLen;


    }
}
