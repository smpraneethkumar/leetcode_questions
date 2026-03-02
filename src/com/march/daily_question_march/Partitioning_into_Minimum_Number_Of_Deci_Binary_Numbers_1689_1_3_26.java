package com.march.daily_question_march;

public class Partitioning_into_Minimum_Number_Of_Deci_Binary_Numbers_1689_1_3_26 {

    public static void main(String[] args) {
        String n = "27346209830709182346";

        System.out.println(minPartitions(n));
    }
    public static int minPartitions(String n) {
        int max = 0;

        for(int i =0;i<n.length();i++){

            int ch = n.charAt(i)-'0';
            System.out.println(ch);

            max = Math.max(max,ch);
        }

        return max;
    }
}
