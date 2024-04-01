package com.forest.leetcode.day50;

/**
 * 力扣题目序号：240.搜索二维矩阵 II
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/search-a-2d-matrix-ii/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月01日 19:18
 */
public class Solution240Case2 {
    /**
     * 二分查找
     *
     * @param matrix
     * @param target
     * @return boolean
     * @author Forest Dong
     * @date 2024/04/01 19:18
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (search(row, target) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = (high - low) + low;
            if (row[mid] == target) {
                return mid;
            } else if (row[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.err.println(searchMatrix(matrix, 5));
    }
}
