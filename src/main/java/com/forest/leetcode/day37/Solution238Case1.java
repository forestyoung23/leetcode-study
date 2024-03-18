package com.forest.leetcode.day37;

/**
 * 力扣题目序号：238.除自身以外数组的乘积
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月18日 20:02
 */
public class Solution238Case1 {
    private static int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        L[0] = 1;
        int[] R = new int[nums.length];
        R[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = L[i] * R[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }
}
