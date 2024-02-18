package com.forest.leetcode.day15;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：1380.矩阵中的幸运数
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/lucky-numbers-in-a-matrix/description/
 * @date 2024年02月18日 14:45
 */
public class Solution1380 {
    /**
     * 思路：
     * 1.找出每行最小的元素
     * 2.判断该元素是否是该列的最大元素
     *
     * @param matrix
     * @return {@link List }<{@link Integer }>
     * @author Forest Dong
     * @date 2024/02/18 15:51
     */
    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int index = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            int max = 0;
            for (int n = 0; n < matrix.length; n++) {
                if (max < matrix[n][index]) {
                    max = matrix[n][index];
                }
            }
            if (max == min) {
                result.add(max);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> result = luckyNumbers(matrix);
        for (Integer number : result) {
            System.err.println(number);
        }
    }
}
