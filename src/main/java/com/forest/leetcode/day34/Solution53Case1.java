package com.forest.leetcode.day34;

/**
 * 力扣题目序号：53.最大子数组和
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/maximum-subarray/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月14日 21:35
 */
public class Solution53Case1 {
    /**
     * 暴力解
     * 双重 for 循环
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/03/14 21:42
     */
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.err.println(maxSubArray(nums));
    }
}
