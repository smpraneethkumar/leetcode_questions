package leetcodeQuestions;

import java.util.Arrays;

public class Plus_one_66 {

    public static void main(String[] args) {
        int digits [] = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));

        }
    public static int[] plusOne(int[] digits) {

        int n = digits.length-1;
        int temp = 0;
        for(int i =0;i<=n;i++){

            if(digits[n-i] < 9){
                digits[n-i]++  ;
            }
            if(digits[n-1] == 9){
                digits[n-i] = 0;
            }
        }
        return digits;
    }
    }




