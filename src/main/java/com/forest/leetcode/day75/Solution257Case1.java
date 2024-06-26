package com.forest.leetcode.day75;

import com.forest.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：257.二叉树的所有路径
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/binary-tree-paths/description/
 * @date 2024年06月26日 19:02
 */
public class Solution257Case1 {
    public final List<List<String>> res = new ArrayList<>();
    public final List<String> path = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        preOrder(root);
        ArrayList<String> list = new ArrayList<>();
        res.forEach(item -> {
            String str = str(item);
            list.add(str);
        });
        return list;
    }

    public void preOrder(TreeNode root) {
        if (null == root) {
            return;
        }
        path.add(root.val + "");
        if (null == root.left && null == root.right) {
            res.add(new ArrayList<>(path));
        }
        preOrder(root.left);
        preOrder(root.right);
        path.remove(path.size() - 1);
    }

    public String str(List<String> path) {
        StringBuilder sb = new StringBuilder();
        for (String s : path) {
            sb.append(s).append("->");
        }
        if (sb.length() > 2) {
            return sb.substring(0, sb.length() - 2);
        }
        return null;
    }
//    public static void main(String[] args) {
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node2 = new TreeNode(2, null, node5);
//        TreeNode node1 = new TreeNode(1, node2, node3);
//        binaryTreePaths(node1);
//    }
}
