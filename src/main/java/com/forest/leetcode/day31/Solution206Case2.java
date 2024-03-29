package com.forest.leetcode.day31;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：206.反转链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月20日 19:56
 */
public class Solution206Case2 {
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = reverseList(node1);
        System.err.println(listNode);
    }
}
