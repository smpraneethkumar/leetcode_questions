package com.leetCode_EA;

public class Valid_Word_3136_me {

    public static void main (String [] args){

        String word = "a3$e";

        System.out.println(isValid(word));

    }
     static public boolean isValid(String word) {

        String str = word.toLowerCase();

//         System.out.println(str);





             boolean hasVowel = false;
             boolean hasConsonant = false;

             for (int i = 0; i < str.length(); i++) {
                 char c = str.charAt(i);

                 // ❌ If special character found return false
                 if (!Character.isLetterOrDigit(c)) {
                     return false;
                 }

                 // Check vowels
                 if ("aeiou".indexOf(c) >= 0) {
                     hasVowel = true;
                 }
                 // Check consonants
                 else if (Character.isLetter(c)) {
                     hasConsonant = true;
                 }
             }

             // Word must contain at least one vowel and one consonant
             return hasVowel && hasConsonant;
    }
}
