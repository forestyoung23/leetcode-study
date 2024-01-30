package com.forest.leetcode.day11;

import java.util.Map;

/**
 * 力扣题目序号：1880.检查某单词是否等于两单词之和
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月30日 16:56
 */
public class Solution1880 {

    private static final Map<Character, Integer> map = Map.of('a', 0, 'b', 1,
            'c', 2, 'd', 3, 'e', 4, 'f', 5, 'g', 6,
            'h', 7, 'i', 8, 'j', 9);

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getSum(firstWord) + getSum(secondWord) == getSum(targetWord);
    }

    private static int getSum(String word) {
        char[] chars = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += map.get(chars[i]) * Math.pow(10, chars.length - 1 - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.err.println(getSum("cdb"));
    }
}
