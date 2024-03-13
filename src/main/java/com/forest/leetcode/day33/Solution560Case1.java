package com.forest.leetcode.day33;

/**
 * 力扣题目序号：560.和为 K 的子数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/subarray-sum-equals-k/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月13日 20:00
 */
public class Solution560Case1 {
    /**
     * 双重 for 循环
     *
     * @param nums
     * @param k
     * @return int
     * @author Forest Dong
     * @date 2024/03/13 20:26
     */
    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                count++;
            }
            int sub = k - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sub -= nums[j];
                if (sub == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {100, 1, 2, 3, 4};
        System.err.println(subarraySum(nums, 6));
    }
}
