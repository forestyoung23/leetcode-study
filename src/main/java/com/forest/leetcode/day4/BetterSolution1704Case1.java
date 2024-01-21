package com.forest.leetcode.day4;

/**
 * 力扣题目序号：面试题 17.04.消失的数字
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/missing-number-lcci/description/
 * @date 2024年01月21日 17:11
 */
public class BetterSolution1704Case1 {
    /**
     * 思路：根据高斯求和公式：(首项 + 尾项) * (项数) / 2
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/01/21 17:40
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return sum - total;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.err.println(missingNumber(nums));
    }
}
