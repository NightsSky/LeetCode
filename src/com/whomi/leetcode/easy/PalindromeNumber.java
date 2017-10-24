package com.whomi.leetcode.easy;

public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.

     click to show spoilers.

     Some hints:
     Could negative integers be palindromes? (ie, -1)

     If you are thinking of converting the integer to string, note the restriction of using extra space.

     You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

     There is a more generic way of solving this problem.
     */
    public static boolean isPalindrome(int x) {

        //特殊情况：
        //如上所述，当x <0时，x不是回文。
        //如果数字的最后一位数字为0，为了成为回文，
        //数字的第一位数字也需要为0.
        //只有0满足此属性。
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int  revertedNumber  =  0 ;
        while (x  >  revertedNumber ) {
            revertedNumber  =  revertedNumber  *  10  +  x%10 ;
            x /=  10 ;
        }

        //当长度是一个奇数时，我们可以通过revertedNumber / 10来摆脱中间的数字
        //例如当输入为12321时，在while循环结束时，我们得到x = 12，revertedNumber = 123，
        //因为中间的数字并不重要（它总是等于自己），我们可以简单地去掉它。
        return  x  ==  revertedNumber  ||  x  ==  revertedNumber / 10 ;

    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(2145412));
    }
}
