package com.forest.leetcode.day14;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 力扣题目序号：993.二叉树的堂兄弟节点
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/cousins-in-binary-tree/description/
 * @date 2024年02月01日 20:14
 */
public class Solution993Case1 {
    /**
     * 使用广度优先搜索遍历二叉树，分别记录x、y的深度和父节点
     *
     * @param root
     * @param x
     * @param y
     * @return boolean
     * @author Forest Dong
     * @date 2024/02/01 20:15
     */
    public static boolean isCousins(TreeNode root, int x, int y) {
        int xDeep = 0;
        TreeNode xFather = null;
        int yDeep = 0;
        TreeNode yFather = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leftIndex = 0;
        int rightIndex = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (null != node.left) {
                leftIndex++;
                if (node.left.val == x) {
                    xDeep = leftIndex;
                    xFather = node;
                }
                if (node.left.val == y) {
                    yDeep = leftIndex;
                    yFather = node;
                }
                queue.offer(node.left);
            }
            if (null != node.right) {
                rightIndex++;
                if (node.right.val == x) {
                    xDeep = rightIndex;
                    xFather = node;
                }
                if (node.right.val == y) {
                    yDeep = rightIndex;
                    yFather = node;
                }
                queue.offer(node.right);
            }
        }
        return xDeep == yDeep && xFather != yFather;
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(3, null, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.err.println(isCousins(node1, 5, 4));
    }
}
