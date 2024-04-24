package com.forest.leetcode.day62;

import com.forest.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：230.二叉搜索树中第K小的元素
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月24日 18:53
 */
public class Solution230Case1 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k - 1);
    }

    public void inOrder(TreeNode node, List<Integer> list) {
        if (null == node) {
            return;
        }
        // 访问优先级：左子树 -> 根节点 -> 右子树
        // 遍历左节点
        inOrder(node.left, list);
        // 逻辑处理
        list.add(node.val);
        // 遍历右节点
        inOrder(node.right, list);
    }
}
