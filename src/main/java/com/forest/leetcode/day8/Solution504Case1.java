package com.forest.leetcode.day8;

/**
 * 力扣题目序号：504.七进制数
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/base-7/description/
 * @date 2024年01月24日 20:22
 */
public class Solution504Case1 {

    /**
     * 思路：除 x 取余法
     * 注意负数进制转换的差异，这里的做法是将负数转换为整数计算最后加上符号位
     *
     * @param num
     * @return {@link String }
     * @author Forest Dong
     * @date 2024/01/24 21:14
     */
    public static String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        convert(Math.abs(num), sb);
        if (num < 0) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    private static void convert(int num, StringBuilder sb) {
        if (7 > num) {
            sb.append(num);
            return;
        }
        sb.append(num % 7 + "");
        convert(num / 7, sb);
    }

    public static void main(String[] args) {
        Integer.toString(1, 7);
        System.err.println(convertToBase7(-8));
    }
}
