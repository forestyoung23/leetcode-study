package com.forest.leetcode.day5;

/**
 * 力扣题目序号：2319.判断矩阵是否是一个 X 矩阵
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/check-if-matrix-is-x-matrix/description/
 * @date 2024年01月22日 20:23
 */
public class Solution2319 {
    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid.length - 1; j >= 0; j--) {
                if (i == j) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (j == grid.length - 1 - i) {
                        if (grid[i][j] == 0) {
                            return false;
                        }
                    } else if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.err.println(checkXMatrix(grid));
    }
}
