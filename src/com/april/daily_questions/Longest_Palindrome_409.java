package com.april.daily_questions;

import java.util.HashMap;

public class Longest_Palindrome_409 {
    public static void main(String[] args) {

        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

//        HashMap<Character,Integer> hm = new HashMap  <>();
//
//        int n = s.length();
//        int ans = 0;
//        for(int i =0;i<n;i++){
//
//            char c = s.charAt(i);
//
//            if(hm.containsKey(c)){
//
//                int re = hm.get(c);
//                hm.put(c,re+1);
//                ans++;
//            }else{
//                hm.put(c,1);
//            }
//        }
//        return ans;

//        int[] freq = new int[128]; // ASCII
//
//        // Count frequency
//        for (char c : s.toCharArray()) {
//            freq[c]++;
//        }
//
//        int length = 0;
//        boolean hasOdd = false;
//
//        for (int count : freq) {
//            if (count % 2 == 0) {
//                length += count; // use all
//            } else {
//                length += count - 1; // use even part
//                hasOdd = true;
//            }
//        }
//
//        // Add one center character if any odd exists
//        if (hasOdd) length++;
//
//        return length;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length++;

        return length;
    }
}
