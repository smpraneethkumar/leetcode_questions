package com.march.daily_questions;

public class Reverse_String_344 {

    public static void main(String[] args) {
            char[] s = {'h','e','l','l','o'};

            reverseString(s);
    }
    public static void reverseString(char[] s) {
// int n =s.length;
//             char[] reverse = new char[n];
//      for(int i =n;i>0;i--){
// reverse[i+1] = s[i];
//      }

//      System.out.println(reverse);


        int left = 0;
        int  right = s.length-1;
        while(left< right){
            char temp = s[left];
            s[left]= s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
