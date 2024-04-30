package com.forest.leetcode.day64;

import com.forest.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：114.二叉树展开为链表
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月30日 17:05
 */
public class Solution114Case1 {
    public static void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode prev = list.get(i - 1);
            TreeNode curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    /**
     * 先序遍历
     *
     * @param root
     * @author Forest Dong
     * @date 2024/04/30 17:11
     */
    private static void preOrder(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(3, null, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        flatten(node1);
    }
}
