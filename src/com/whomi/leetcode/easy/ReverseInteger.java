package com.whomi.leetcode.easy;

public class ReverseInteger {
    /**
     * Reverse digits of an integer.

     Example1: x = 123, return 321
     Example2: x = -123, return -321

     click to show spoilers.

     Note:
     The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
     */

    public static int reverse(int x) {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newNum = result * 10 + tail;

            if ((newNum - tail) / 10 != result) {
                return 0;
            }
            result = newNum;
            x = x / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println( reverse(-2147483648));
    }
}
