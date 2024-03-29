package com.forest.leetcode.day48;

import com.forest.leetcode.common.TreeNode;

/**
 * 力扣题目序号：104.二叉树的最大深度
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月29日 17:37
 */
public class Solution104Case1 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(3, null, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.err.println(maxDepth(node1));
    }
}
