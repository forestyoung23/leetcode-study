package com.forest.leetcode.day60;

import com.forest.leetcode.common.TreeNode;

/**
 * 力扣题目序号：108.将有序数组转换为二叉搜索树
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月19日 18:35
 */
public class Solution108Case1 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
