package com.forest.leetcode.day4;

/**
 * 力扣题目序号：面试题 17.04.消失的数字
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/missing-number-lcci/description/
 * @date 2024年01月21日 16:59
 */
public class Solution1704Case2 {
    public static int missingNumber(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length + 1;
    }

    /**
     * 排序
     *
     * @param arr
     * @author Forest Dong
     * @date 2024/01/21 16:41
     */
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.err.println(missingNumber(nums));
    }
}
