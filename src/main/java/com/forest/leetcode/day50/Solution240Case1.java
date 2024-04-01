package com.forest.leetcode.day50;

/**
 * 力扣题目序号：240.搜索二维矩阵 II
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/search-a-2d-matrix-ii/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月01日 19:05
 */
public class Solution240Case1 {
    /**
     * 遍历
     *
     * @param matrix
     * @param target
     * @return boolean
     * @author Forest Dong
     * @date 2024/04/01 19:18
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.err.println(searchMatrix(matrix, 5));
    }
}
