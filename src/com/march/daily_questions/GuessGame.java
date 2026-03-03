package com.march.daily_questions;

class GuessGame {
  public  static int picked = 6;   // hidden number

    public static int guess(int num) {
        if (num == picked) return 0;
        if (num > picked) return -1;
        return 1;
    }
}