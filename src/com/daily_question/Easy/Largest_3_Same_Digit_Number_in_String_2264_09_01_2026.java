package com.daily_question.Easy;

public class Largest_3_Same_Digit_Number_in_String_2264_09_01_2026 {

    public static void main(String[] args) {
        String nums = "2300019";

        System.out.println(largestGoodInteger(nums));

        System.out.println("this is a vasit line and delete ather words ");
    }

    public static String largestGoodInteger(String num) {

        String ans = "";
        int n = num.length() - 3;
        for (int i = 0; i < n; i++) {
            char w = num.charAt(i);
            if (w == num.charAt(i + 1) && w == num.charAt(i + 2)) {
                String number = "" + w + w + w;

                if (ans.equals("") || number.compareTo(ans) > 0) {
                    ans = number;
                }

            }

        }
        return ans;

    }
}

