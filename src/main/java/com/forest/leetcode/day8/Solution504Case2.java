package com.forest.leetcode.day8;

/**
 * 力扣题目序号：504.七进制数
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/base-7/description/
 * @date 2024年01月24日 21:27
 */
public class Solution504Case2 {
    public static String convertToBase7(int num) {
        if (0 == num) {
            return "0";
        }
        boolean negative = num < 0;
        StringBuilder sb = new StringBuilder();
        num = Math.abs(num);
        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (negative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.err.println(convertToBase7(-8));
    }
}
