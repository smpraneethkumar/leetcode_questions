package com.march.daily_question_march;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones_1784_6_3_26 {

    public static void main(String[] args) {
        String s = "1001";

        System.out.println(checkOnesSegment(s));

    }
    public static boolean checkOnesSegment(String s) {

        int n = s.length();
        int count = 0;

        int i=0;

        while(i<n){

            if(s.charAt(i) =='1'){
                count++;

                while(i<n && s.charAt(i) =='1'){
                    i++;
                }
            }else{

                i++;
            }

            if(count > 1){
                return false;
            }
        }

        return true;

    }
}
