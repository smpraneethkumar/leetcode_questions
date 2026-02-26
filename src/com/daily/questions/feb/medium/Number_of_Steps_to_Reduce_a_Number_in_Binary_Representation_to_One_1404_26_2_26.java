package com.daily.questions.feb.medium;

public class Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One_1404_26_2_26 {

    public static void main(String[] args) {
String s = "1101";

        System.out.println(numSteps(s));

    }

    public  static int numSteps(String s) {

        int ans = 0;
        int carry = 0;

        char arr[] = s.toCharArray();

        for(int i = arr.length-1;i>0;i--){

            if(arr[i] -'0' + carry == 1){

                carry =1;
                ans = ans+2;
            }else {
                ans++;
            }
        }
        return ans +carry;
    }
}
