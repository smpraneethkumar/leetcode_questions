package com.march.daily_questions;

class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public  static int numberOfSteps(int num) {
        
        return helper(num,0);


    }

    public static int  helper(int num, int steps){

        if(num == 0){
            return steps;
        }

        if(num%2==0){
             return   helper(num/2,steps+1);
        }

        return helper(num-1,steps+1);
    }

    public static void main(String[] args) {

        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}