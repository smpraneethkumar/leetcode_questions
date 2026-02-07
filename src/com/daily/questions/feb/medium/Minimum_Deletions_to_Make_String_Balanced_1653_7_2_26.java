package com.daily.questions.feb.medium;

import java.util.Stack;

class Minimum_Deletions_to_Make_String_Balanced_1653_7_2_26 {

    public static void main(String[] args) {

        String s = "aababbab";

        System.out.println(minimumDeletions(s));
    }
    public static int minimumDeletions(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'b'){

                st.push('b');
            }else{
                if(!st.isEmpty()){
                    ans++;
                    st.pop();
                }
            }
        }

        return ans;
    }
}