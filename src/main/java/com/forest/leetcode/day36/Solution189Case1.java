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
     * 若 k == nums.length 则轮转一轮后结果依然是原数组
     * 因此，只需要轮转 (k % nums.length) 个位置即可.
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int count = k % nums.length;
        if (0 == count) {
            return;
        }
        int[] temp = new int[count];
        int length = nums.length;
        for (int i = 0; i < count; i++) {
            temp[i] = nums[length - count + i];
        }
        for (int i = length - count - 1; i >= 0; i--) {
            nums[i + count] = nums[i];
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
