package com.forest.leetcode.day62;

import com.forest.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 力扣题目序号：230.二叉搜索树中第K小的元素
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月24日 19:10
 */
public class Solution230Case2 {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }
}
