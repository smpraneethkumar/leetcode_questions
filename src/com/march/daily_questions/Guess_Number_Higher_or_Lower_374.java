package com.march.daily_questions;

public class Guess_Number_Higher_or_Lower_374 extends GuessGame {

    public static int guessNumber(int n) {

        int left = 1;
        int right = n;

        while(left <= right){

            int mid = left +( right- left) /2;

            int result = guess(mid);

            if(result == 0) return mid;
            else if(result == -1)  right= mid-1;
            else left = mid+1;
        }

        return -1;

    }
    public static void main(String[] args) {

        System.out.println(guessNumber(10));
    }
}
