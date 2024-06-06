package com.forest.leetcode.day72;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 力扣题目序号：394.字符串解码
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/decode-string/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年05月30日 19:40
 */
public class Solution394Case2 {

    static int index;

    public static String decodeString(String s) {
        LinkedList<String> result = new LinkedList<>();
        char[] chars = s.toCharArray();
        while (index < chars.length) {
            if (Character.isDigit(chars[index])) {
                String num = getDigit(chars);
                result.addLast(num);
            } else if (Character.isLetter(chars[index]) || '[' == chars[index]) {
                result.addLast(String.valueOf(chars[index++]));
            } else {
                index++;
                LinkedList<String> sub = new LinkedList<>();
                while (!"[".equals(result.peekLast())) {
                    sub.addLast(result.removeLast());
                }
                result.removeLast();
                Collections.reverse(sub);
                Integer num = Integer.valueOf(result.removeLast());
                StringBuilder sb = new StringBuilder();
                String str = getString(sub);
                while (0 < num--) {
                    sb.append(str);
                }
                result.addLast(sb.toString());
            }
        }
        return getString(result);
    }


    public static String getString(LinkedList<String> v) {
        StringBuilder ret = new StringBuilder();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }
    private static String getDigit(char[] chars) {
        StringBuilder sb = new StringBuilder();
        while (Character.isDigit(chars[index])){
            sb.append(chars[index++]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "2[a2[bc]]";
        System.err.println(decodeString(s));
    }
}
