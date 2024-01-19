package com.forest.leetcode.day3;

import java.util.List;

/**
 * 力扣题目序号：2062
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月19日 17:59
 */
public class Solution2062 {

    public int countVowelSubstrings(String word) {
        /// TODO: 2024/1/19 未完待续
        char[] words = word.toCharArray();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < words.length - 4; i++) {
            if (vowels.contains(words[i]) && vowels.contains(words[i + 1]) &&
                    vowels.contains(words[i + 2]) && vowels.contains(words[i + 3]) && vowels.contains(words[i + 4])) {
                count++;
            }
        }
        return count;
    }
}
