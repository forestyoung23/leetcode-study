package com.forest.leetcode.day70;

import java.util.Stack;

/**
 * 力扣题目序号：20.有效的括号
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年05月23日 20:12
 */
public class Solution20Case2 {
    public boolean isValid(String s) {
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chs) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                Character target = stack.pop();
                if ((ch == ')' && target != '(') || (ch == ']' && target != '[') || (ch == '}' && target != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
