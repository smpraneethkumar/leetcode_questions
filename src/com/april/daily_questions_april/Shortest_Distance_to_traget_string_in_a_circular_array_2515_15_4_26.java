package com.april.daily_questions_april;

public class Shortest_Distance_to_traget_string_in_a_circular_array_2515_15_4_26 {

    public static void main(String[] args) {

        String [] words = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        int startIndex = 1;

        System.out.println(closetTarget(words,target,startIndex));
    }
    public  static int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i - startIndex);
                int distance = Math.min(diff, n - diff);
                ans = Math.min(ans, distance);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
