package com.daily_question;

public class Power_of_three_326_06_01_2026 {

    public static  void main(String[] agrs){
        int n = 27;

        System.out.println(isPowerOfThree(n));
    }
    public static  boolean isPowerOfThree(int n) {

//        boolean ans = false;
//        int in = 3;
//        if(n%3 == 0 && n !=0){
//            ans = true;
//        }
////        else{
////            in += 3;
////        }
//        return ans;

        if(n <= 0){
            return false;
        }

        while( n%3 ==0){
            n = n/3;
        }
        return n ==1;
    }
}
