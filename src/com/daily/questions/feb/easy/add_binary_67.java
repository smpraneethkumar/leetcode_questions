package com.daily.questions.feb.easy;

public class add_binary_67 {

    public static void main(String[] args) {

        String a = ""
    }
    class Solution {
        public String addBinary(String a, String b) {

            StringBuilder sb = new StringBuilder();

            int i = a.length()-1;
            int j = b.length()-1;
            int curry = 0;

            while(i>=0 || j >=0 || curry==1){

                int sum = curry;

                if(i>=0){
                    sum = sum+a.charAt(i) -'0';
                    i--;
                }
                if(j>=0){
                    sum = sum+b.charAt(j) -' 0';
                    j--;
                }
                sb.append(sum%2);
                curry = sum/2;
            }


            return sb.reverse().toString();
        }

    }
}
