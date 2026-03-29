package com.leetCode_EA;

public class Defanging_an_IP_Address_1108 {

    public static void main(String[] args) {


        String address = "1.1.1.1";


        String ans = "";

        System.out.println(ans);

        for(int i = 0; i<address.length();i++) {

            char ch = address.charAt(i);

            if(ch == '.') {

                ans = ans + "[.]";

            }
            else {
                ans = ans + "1";
            }

        }
    }
}