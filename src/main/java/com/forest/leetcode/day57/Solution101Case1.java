package com.forest.leetcode.day57;

import com.forest.leetcode.common.TreeNode;

/**
 * 力扣题目序号：101.对称二叉树
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月16日 18:49
 */
public class Solution101Case1 {
    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode node3 = new TreeNode(2, null, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.err.println(isSymmetric(node1));
    }
}
