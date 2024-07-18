package com.forest.leetcode.day79;

/**
 * 力扣题目序号：35.搜索插入位置
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年07月18日 15:44
 */
public class Solution35Case1 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 1;
        System.err.println(searchInsert(nums, target));
    }
}
