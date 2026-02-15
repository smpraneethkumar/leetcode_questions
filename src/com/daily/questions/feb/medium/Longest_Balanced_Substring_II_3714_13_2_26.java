package com.daily.questions.feb.medium;

import java.util.HashMap;

public class Longest_Balanced_Substring_II_3714_13_2_26 {

    public static void main(String[] args) {
;
        String s = "abbac";

        System.out.println(longestBalanced(s));
    }
    public static int longestBalanced(String s) {

        int n = s.length();
        int maxlen = 0;

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            int len = 0;

            while(i<n && ch==s.charAt(i)){
                i++;
                len++;
            }
            maxlen = Math.max(maxlen,len);
        }

//        2
        maxlen = Math.max(maxlen, getLength(s,'a'));
        maxlen = Math.max(maxlen, getLength(s,'b'));
        maxlen = Math.max(maxlen, getLength(s,'c'));

//        3
        HashMap<String,Integer> prev = new HashMap<>();
        int c1 = 0, c2=0, c3=0;
        prev.put("0#0",-1);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch=='a'){
                c1++;
            } else if (ch=='b') {
                c2++;
            }else {
                c3++;
            }
            int diff1 = a-b;
            int diff2 = a-c;
            String key = diff1 + "#" + diff2;

            if(prev.containsKey(key)){
                maxlen = Math.max(maxlen,i-prev.get(key));
            }else {
                prev.put(key,i);
            }
        }

return maxlen;
    }

    public  static int getLength(String s,char skip){
        int mlen = 0;
        char first = (skip=="a") ? 'b' :'a';
        char second = (skip=="c") ? 'b' :'c';
        int i =0, n = s.length();

        while (i<n){
            int c1 = 0, c2 = 0;
            int len = 0;
HashMap<Integer,Integer> prev = new HashMap<>();
        while (i<n && s.charAt(i) != skip){
                char ch = s.charAt(i);
                if(ch==first){
                    c1++;

                }else c2++;
                prev.containsKey(c1-c2){
                    mlen = Math.max(mlen,i-prev.get(c1-c2));
            }e lse prev.put(c1-c2,i);
                i++;
        }
        i++;
        }
        return mlen;
    }
}
