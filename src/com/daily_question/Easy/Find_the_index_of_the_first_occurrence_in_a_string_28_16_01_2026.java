package com.daily_question.Easy;

public class Find_the_index_of_the_first_occurrence_in_a_string_28_16_01_2026 {

    public static void main (String [] args){

                String haystack = "sadbutsad";
                String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public  static int strStr(String haystack, String needle) {

//        THIS  OUR TRY
//        int answer = -1;
//        int temp =0;
//        for(int i =0;i<needle.length()-1;i++){
//            char h = haystack.charAt(i);
//            char n = needle.charAt(i);
//            if(h == n){
//                temp++;
//            }
//        }
//
//        if(temp == needle.length()-1){
//            int val =  0;
//            answer = val;
//        }
//        return answer;

        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;
            while (j < needle.length() &&
                    haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
