package com.forest.leetcode.day70;

import java.util.List;
import java.util.Stack;

/**
 * 力扣题目序号：20.有效的括号
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年05月23日 19:52
 */
public class Solution20Case1 {
    private static final List<Character> leftList = List.of('(', '[', '{');
    private static final List<Character> rightList = List.of(')', ']', '}');

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (null == chars || 0 == chars.length) {
            return false;
        }
        if (rightList.contains(chars[0])) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (leftList.contains(aChar)) {
                stack.add(aChar);
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (rightList.contains(aChar)) {
                Character peek = stack.peek();
                if (('(' == peek && ')' == aChar) || ('[' == peek && ']' == aChar) || ('{' == peek && '}' == aChar)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
