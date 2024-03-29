package com.forest.leetcode.day7;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：83.删除排序链表中的重复元素
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/remove-duplicates-from-sorted-list/description/
 * @date 2024年01月24日 17:35
 */
public class Solution83 {
    /**
     * 思路：使用递归实现
     * 若当前节点值等于下一节点值，则设置当前节点的下一节点为下下个节点
     *
     * @param head
     * @return {@link ListNode }
     * @author Forest Dong
     * @date 2024/01/24 19:44
     */
    public static ListNode deleteDuplicates(ListNode head) {
        delete(head);
        return head;
    }

    private static void delete(ListNode node) {
        if (null == node || null == node.next) {
            return;
        }
        if (node.val == node.next.val) {
            if (null == node.next.next) {
                node.next = null;
            } else {
                node.next = node.next.next;
                // 这里需要继续递，防止连续多个重复元素
                delete(node);
            }
        }
        delete(node.next);
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = deleteDuplicates(node1);
        while (null != listNode) {
            System.err.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
