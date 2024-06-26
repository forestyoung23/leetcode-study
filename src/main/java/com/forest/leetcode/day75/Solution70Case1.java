package com.forest.leetcode.day75;

/**
 * 力扣题目序号：70.爬楼梯
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/climbing-stairs/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年06月26日 16:42
 */
public class Solution70Case1 {
    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        System.err.println(climbStairs(2));
        System.err.println(climbStairs(5));
        System.err.println(climbStairs(45));
        System.err.println(climbStairs(21));
    }
}
