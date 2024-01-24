package com.forest.leetcode.day9;

/**
 * 力扣题目序号：2643.一最多的行
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/row-with-maximum-ones/description/
 * @date 2024年01月24日 21:55
 */
public class Solution2643 {

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int[] result = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int x : mat[i]) {
                if (1 == x) {
                    count++;
                }
            }
            if (count > max) {
                result[0] = i;
                result[1] = count;
                max = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 1}};
        rowAndMaximumOnes(mat);
    }
}