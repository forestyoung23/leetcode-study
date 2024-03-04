package com.forest.leetcode.day21;

/**
 * 力扣题目序号：1.两数之和
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月04日 20:01
 */
public class Solution1Case1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ints = twoSum(nums, 9);
        for (int anInt : ints) {
            System.err.println(anInt);
        }
    }
}
