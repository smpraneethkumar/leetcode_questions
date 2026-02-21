package com.daily.questions.feb.easy;

public class Prime_Number_of_Set_Bits_in_Binary_Representation_762_21_2_26 {

    public static void main(String[] args) {

        int left = 6;
        int rigth = 10;

        System.out.println(countPrimeSetBits(left,rigth));

    }
    public static int countPrimeSetBits(int left, int right) {

        int count = 0;

        for (int s = left; s <= right; s++) {

            int setBits = Integer.bitCount(s);

            if (isPrime(setBits)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
