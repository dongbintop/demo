package com.dongbin.algorithm.db20190219;

/**
 * int 回文数字
 */
public class PalindromeNumber {

    public static boolean isPalindromeNumber(int n) {
        if (n < 0) {
            return false;
        }

        int help = 1;

        while (n / help >= 10) {
            help *= 10;
        }

        while (n != 0) {
            if (n / help != n % 10) {
                return false;
            }

            n = (n % help) / 10;
            help = help / 100;
        }

        return true;
    }
}