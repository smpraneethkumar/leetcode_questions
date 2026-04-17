package com.april.daily_questions;

public class Convert_the_temperture_2469 {

    public static void main(String[] args) {

        double celsius =  36.50;

        System.out.println(convertTemperature(celsius));

    }
    public static double[] convertTemperature(double celsius) {
        //  f = 1.8*temp1+32
        //  k = c+ 275.15



        double[] ans = new double[2];

        ans[0] = celsius+273.15;
        ans[1] = 1.8*celsius+32;

        return ans;
    }
}
