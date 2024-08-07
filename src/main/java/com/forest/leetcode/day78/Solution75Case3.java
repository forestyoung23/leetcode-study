package com.forest.leetcode.day78;

/**
 * 力扣题目序号：75.颜色分类
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/sort-colors/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年07月05日 17:47
 */
public class Solution75Case3 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for (int i = 0; i <= p2; ++i) {
            while (i <= p2 && nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                ++p0;
            }
        }
    }
}
