package com.forest.leetcode.day36;

/**
 * 力扣题目序号：189.轮转数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月17日 18:18
 */
public class Solution189Case3 {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = nums[(i + k + 1) % length];
        }
        System.arraycopy(newArr, 0, nums, 0, length);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.err.println(1);
    }
}
