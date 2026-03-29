package com.leetCode_EA;

public class Jewele_and_Stones_771 {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int ans = 0;



        for(int i =0;i<jewels.length();i++) {


            char jew = jewels.charAt(i);

            for(int j = 0;j<stones.length();j++) {

                char sto = stones.charAt(j);

                if(jew == sto) {

                    ans = ans + 1;
                }

            }
        }

        System.out.println(ans);
    }
}