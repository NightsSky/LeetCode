package com.whomi.leetcode.easy;

public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
        最长公共前缀字符串


     * @param
     */

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;

    }
    public static void main(String[] args) {
        String[] strs = {"aa","aagrg","aaarhhht"};
        System.out.println(longestCommonPrefix(strs));
    }
}
