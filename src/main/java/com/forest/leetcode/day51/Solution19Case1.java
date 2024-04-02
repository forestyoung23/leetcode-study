package com.forest.leetcode.day51;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：19.删除链表的倒数第 N 个结点
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月02日 19:22
 */
public class Solution19Case1 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp =head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = removeNthFromEnd(node1, 2);
        System.err.println(listNode);
    }
}
