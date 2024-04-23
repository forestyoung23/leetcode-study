package com.forest.leetcode.day61;

import com.forest.leetcode.common.TreeNode;

/**
 * 力扣题目序号：98.验证二叉搜索树
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/validate-binary-search-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月23日 19:00
 */
public class Solution98Case1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}
