package com.forest.leetcode.day37;

/**
 * 力扣题目序号：238.除自身以外数组的乘积
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月18日 20:24
 */
public class Solution238Case2 {
    private static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
        int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * R;
            R *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }
}
