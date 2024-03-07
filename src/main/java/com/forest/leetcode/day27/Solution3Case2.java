package com.forest.leetcode.day27;

import java.util.HashSet;

/**
 * 力扣题目序号：3.无重复字符的最长子串
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月07日 20:48
 */
public class Solution3Case2 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int r = 0, max = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != 0) {
                set.remove(chars[i - 1]);
            }
            while (r < chars.length && !set.contains(chars[r])) {
                set.add(chars[r]);
                r++;
            }
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.err.println(lengthOfLongestSubstring(s));
    }
}
