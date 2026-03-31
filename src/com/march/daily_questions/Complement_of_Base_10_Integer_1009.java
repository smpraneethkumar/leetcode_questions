package com.march.daily_questions;

public class Complement_of_Base_10_Integer_1009 {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(bitWiseComplement(n));
    }

    public  static  int bitWiseComplement(int n ){

//        int a = n
//
//        String a = Integer.toBinaryString(n);
//
//       int  b= Integer.getInteger(a);
//        System.out.println(a);
//        System.out.println(b);
//        return 3;


        if (n == 0) return 1;

        int mask = 0;
        int temp = n;

        // Create mask like 111... same length as n
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return n ^ mask;
        }

}
