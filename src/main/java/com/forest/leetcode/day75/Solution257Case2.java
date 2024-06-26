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
 * @date 2024年06月26日 19:39
 */
public class Solution257Case2 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    public static void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(root.val);
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);
        binaryTreePaths(node1);
    }
}
