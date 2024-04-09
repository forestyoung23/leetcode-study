package com.forest.leetcode.day53;

import com.forest.leetcode.common.TreeNode;

/**
 * 力扣题目序号：226.翻转二叉树
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月09日 20:20
 */
public class Solution226Case1 {
    public static TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
