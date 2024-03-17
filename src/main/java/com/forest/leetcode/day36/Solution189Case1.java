package com.forest.leetcode.day36;

/**
 * 力扣题目序号：189.轮转数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月17日 17:13
 */
public class Solution189Case1 {
    /**
     * 该方案适用于：k < nums.length
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[length - k + i];
        }
        for (int i = length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.err.println(1);
    }
}
