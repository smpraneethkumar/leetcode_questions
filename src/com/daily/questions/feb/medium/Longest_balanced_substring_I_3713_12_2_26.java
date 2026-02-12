package com.daily.questions.feb.medium;

import java.util.HashMap;

public class Longest_balanced_substring_I_3713_12_2_26 {

    public static void main(String[] args) {

        String s = "zabbac";

//        int index = s.charAt(0) - 'a';
//        System.out.println(s.charAt(0));
//        System.out.println(index);
        System.out.println(longestBalanced(s));

    }
    public static int longestBalanced(String s ){

        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            int distinct = 0;
            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'a';

                if (freq[index] == 0) {
                    distinct++;
                }

                freq[index]++;
                maxFreq = Math.max(maxFreq, freq[index]);

                int length = j - i + 1;

                if (maxFreq * distinct == length) {
                    maxLen = Math.max(maxLen, length);
                }
            }
        }

        return maxLen;
    }
}
