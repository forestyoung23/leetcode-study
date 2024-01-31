package com.forest.leetcode.day12;

/**
 * 力扣题目序号：922.按奇偶排序数组 II
 * 难度：简单
 *
 * @link https://leetcode.cn/problems/sort-array-by-parity-ii/description/
 * @author Forest Dong
 * @date 2024年01月30日 17:49
 */
public class Solution922 {
    /**
     * 定义两个指针i和j，分别记录偶数和奇数对应位置的元素，每次各加2，并把奇偶排序后的结果存在新数组中。
     *
     * @param nums
     * @return {@link int[] }
     * @author Forest Dong
     * @date 2024/01/30 19:49
     */
    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0, j = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[i] = num;
                i += 2;
            } else {
                result[j] = num;
                j += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {4, 2, 5, 7};
        int[] array = sortArrayByParityII(num);
        for (int i : array) {
            System.err.println(i);
        }
    }
}
