package com.forest.leetcode.day34;

/**
 * 力扣题目序号：53.最大子数组和
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/maximum-subarray/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月14日 21:43
 */
public class Solution53Case2 {
    /**
     * 动态规划
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/03/14 21:47
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.err.println(maxSubArray(nums));
    }
}
