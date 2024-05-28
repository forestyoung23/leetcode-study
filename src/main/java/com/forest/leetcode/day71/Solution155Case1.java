package com.forest.leetcode.day71;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 力扣题目序号：155.最小栈
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/min-stack/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年05月28日 18:46
 */
public class Solution155Case1 {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public Solution155Case1() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
