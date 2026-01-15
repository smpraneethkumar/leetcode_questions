package com.daily_question.esay;

public class Power_of_four_342_06_01_2026 {

    public static void main(String[] args) {

        int n = 16;

        System.out.println(isPowerOfFour(n));


    }

  static  public boolean isPowerOfFour(int n) {

        if( n <= 0){
            return false;
        }
        while(n%4 ==0){

            n = n/4;
        }
        return n==1;
    }
}
