package com.daily.questions.feb.easy;

public class Count_binarySubstring_696_19_2_2026 {

    public static void main(String[] args) {

        String s= "00110011";

        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {


        int n = s.length();
        int r = 2;
        int ans =0;
//        for(int i =0;i<n;i++){

            for (int j =0;j<r;j++){

                if (s.charAt(j) != s.charAt(j+1)){

                    ans++;
                }
//            }
        }

        return ans;
    }
}
