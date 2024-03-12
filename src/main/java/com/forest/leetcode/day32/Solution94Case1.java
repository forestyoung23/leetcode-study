package com.forest.leetcode.day32;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：94.二叉树的中序遍历
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/binary-tree-inorder-traversal/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月12日 19:35
 */
public class Solution94Case1 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private static void inOrder(TreeNode root, List<Integer> list) {
        if (null == root) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node5;
        node2.left = node3;
        node2.right = node4;
        List<Integer> integers = inorderTraversal(node1);
        System.err.println(integers);
    }
}
