package com.forest.leetcode.day14;

/**
 * @author Forest Dong
 * @date 2024年02月01日 20:41
 */
public class Solution993Case2 {
    static int xValue;
    static int xDept;
    static TreeNode xParent;
    static boolean xFound;

    static int yValue;
    static int yDept;
    static TreeNode yParent;
    static boolean yFound;

    /**
     * 使用深度优先搜索遍历二叉树，分别记录x、y的深度和父节点
     *
     * @param root
     * @param x
     * @param y
     * @return boolean
     * @author Forest Dong
     * @date 2024/02/01 20:49
     */
    public static boolean isCousins(TreeNode root, int x, int y) {
        xValue = x;
        yValue = y;
        dfs(root, 0, null);
        return xDept == yDept && xParent != yParent;
    }

    private static void dfs(TreeNode node, int dept, TreeNode parent) {
        if (node == null) {
            return;
        }
        if (node.val == xValue) {
            xDept = dept;
            xParent = parent;
            xFound = true;
        }
        if (node.val == yValue) {
            yDept = dept;
            yParent = parent;
            yFound = true;
        }
        if (xFound && yFound) {
            return;
        }
        dfs(node.left, dept + 1, node);
        if (xFound && yFound) {
            return;
        }
        dfs(node.right, dept + 1, node);
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
