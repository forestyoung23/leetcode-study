package com.forest.leetcode.day24;

/**
 * 力扣题目序号：283.移动零
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月05日 20:29
 */
public class Solution283Case1 {
    public static void moveZeroes(int[] nums) {
        if (null == nums) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.err.println(num);
        }
    }
}
