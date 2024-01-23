package com.forest.leetcode.day6;

/**
 * 力扣题目序号：面试题16.07.最大数值
 * 难度：简单
 *
 * @link https://leetcode.cn/problems/maximum-lcci/description/
 * @author Forest Dong
 * @date 2024年01月23日 19:25
 */
public class Solution1607 {
    /**
     * 首先 a - b 得到差值x
     * 由于是long型，右移63位得到符号位，注意负号不变，那么正数右移63位就是0，负数右移63位就是-1
     * 那么得出我们的计算公式 (1 + k) * a - b * k
     * 当 x >= 0 的时候，k = 0, 即 a > b
     * 那么我们的计算公式为 1 * a - b * 0 = a
     * 当 x < 0的时候，k = -1, 即 b > a
     * 那么我们的计算公式为 0 * a - b * ( -1 ) = b
     *
     * @param a
     * @param b
     * @return int
     * @author Forest Dong
     * @date 2024/01/23 19:30
     */
    public static int maximum(int a, int b) {
        long x = a - b;
        int k = (int) x >> 63;
        return (1 + k) * a - k * b;
    }

    public static void main(String[] args) {
        System.err.println(maximum(-9, 20));
    }
}
