package com.forest.leetcode.day38;

/**
 * 力扣题目序号：41.缺失的第一个正数
 * 难度：困难
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/first-missing-positive/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月19日 20:12
 */
public class Solution41Case3 {
    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 11, 12};
        System.err.println(firstMissingPositive(nums));
    }
}
