package com.march.daily_question_march;

public class Minimum_Changes_To_Make_Alternating_Binary_String_1758_5_3_26 {

    public static void main(String[] args) {
        String s = "1111";

        System.out.println(minOperations(s));
    }

    public static int minOperations(String s) {

        int zeroStart = 0, oneStart = 0;

        for(int i =0;i<s.length();i++){

            char c = s.charAt(i);

            if(i%2==0){

                if(c =='0'){
                    oneStart++;
                }else zeroStart++;
            }else{

                if(c =='0'){
                    zeroStart++;
                }else oneStart++;
            }
        }

        return Math.min(zeroStart,oneStart);
    }

}
