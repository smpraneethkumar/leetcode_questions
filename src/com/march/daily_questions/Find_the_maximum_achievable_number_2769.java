package com.march.daily_questions;

public class Find_the_maximum_achievable_number_2769 {

    public static void main(String[] args) {

        int num = 4;
        int t = 1;
        System.out.println(theMaximumAchievableX(num,t));
    }
    public static int theMaximumAchievableX(int num, int t) {

        return num + 2 * t;
    }
}
