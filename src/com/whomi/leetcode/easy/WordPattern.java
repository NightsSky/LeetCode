package com.whomi.leetcode.easy;
//290


/*

* Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
    pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.*/


import java.util.HashMap;
import java.util.Map;


/**
 * title  290
 *
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class WordPattern {
    //利用map  put方法 返回 前一次映射的值的特性   （老毕的说法叫返回他的前妻） 666666
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i){
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
                return false;
            }
//            System.out.println(index.put(pattern.charAt(i), i));
//            System.out.println(index.put(words[i], i));
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abbacccab";
        String str = "dog cat cat dog pig pig pig dog cat";
        System.out.println(wordPattern(pattern, str));
    }
}
