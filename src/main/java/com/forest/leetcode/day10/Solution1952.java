package com.forest.leetcode.day10;

/**
 * 力扣题目序号：1952.三除数
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/three-divisors/description/
 * @date 2024年01月25日 20:46
 */
public class Solution1952 {
    /**
     * 思路
     * 给定一个正整数 n,如任意一个小于 n 的正整数 i,
     * 满足 n % i == 0,则 i 是 n 的正除数
     *
     * @param n
     * @return boolean
     * @author Forest Dong
     * @date 2024/01/25 21:05
     */
    public static boolean isThree(int n) {
        if (n < 4) {
            return false;
        }
        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (0 == n % i) {
                count ++;
            }
            if (count > 3) {
                return false;
            }
        }
        return 3 == count;
    }

    public static void main(String[] args) {
        System.err.println(isThree(4));
    }
}
