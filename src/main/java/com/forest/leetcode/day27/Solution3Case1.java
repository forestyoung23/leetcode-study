package com.forest.leetcode.day27;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：3.无重复字符的最长子串
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月07日 20:19
 */
public class Solution3Case1 {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (1 == chars.length) {
            return 1;
        }
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            List<Character> result = new ArrayList<>();
            result.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                if (result.contains(chars[j])) {
                    if (max < result.size()) {
                        max = result.size();
                    }
                    break;
                } else {
                    result.add(chars[j]);
                    if (max < result.size()) {
                        max = result.size();
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.err.println(lengthOfLongestSubstring(s));
    }
}
