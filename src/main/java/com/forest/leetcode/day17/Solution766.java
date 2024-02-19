package com.forest.leetcode.day17;

/**
 * 力扣题目序号：766.托普利茨矩阵
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/toeplitz-matrix/description/
 * @date 2024年02月19日 17:27
 */
public class Solution766 {
    /**
     * 思路：
     * 假设矩阵的横坐标为i，纵坐标为j。
     * 则对角线上的下一个元素的坐标为i+1和j+1
     *
     * @param matrix
     * @return boolean
     * @author Forest Dong
     * @date 2024/02/19 17:34
     */
    private static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.err.println(isToeplitzMatrix(matrix));
    }
}
