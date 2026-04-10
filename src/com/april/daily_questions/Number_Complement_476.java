package com.april.daily_questions;

public class Number_Complement_476 {

    public static void main(String[] args) {

        int num = 5;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int mask = 0;
        int temp = num;

        // Create mask like 111... same length as n
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return num ^ mask;

        // i pasted for chartGPT idk when i will learn to solve the problems
    }
}
