package com.forest.leetcode.day20;

/**
 * 力扣题目序号：409.最长回文串
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/longest-palindrome/description/
 * @date 2024年02月26日 16:34
 */
public class Solution409 {
    /**
     * 思路
     * 在一个回文串中，只有最多一个字符出现了奇数次，其余的字符都出现偶数次
     *
     * @param s
     * @return int
     * @author Forest Dong
     * @date 2024/03/04 19:42
     */
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abc1123";
        System.err.println(longestPalindrome(str));
    }
}
