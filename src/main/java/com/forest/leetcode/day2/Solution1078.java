package com.forest.leetcode.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：1078
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月17日 20:25
 */
public class Solution1078 {
    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] result = findOcurrences("we will we will rock you", "we", "will");
        for (String s : result) {
            System.err.println(s);
        }
    }
}
