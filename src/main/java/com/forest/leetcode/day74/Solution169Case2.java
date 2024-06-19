package com.forest.leetcode.day74;

import java.util.Arrays;

/**
 * 力扣题目序号：169.多数元素
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/majority-element/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年06月19日 19:52
 */
public class Solution169Case2 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.err.println(majorityElement(nums));
    }
}
