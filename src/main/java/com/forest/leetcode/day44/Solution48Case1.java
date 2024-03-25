package com.forest.leetcode.day44;

/**
 * 力扣题目序号：48.旋转图像
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/rotate-image/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月25日 19:38
 */
public class Solution48Case1 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}
