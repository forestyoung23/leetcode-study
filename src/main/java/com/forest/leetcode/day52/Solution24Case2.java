package com.forest.leetcode.day52;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：24.两两交换链表中的节点
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/swap-nodes-in-pairs/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月03日 14:53
 */
public class Solution24Case2 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = swapPairs(node1);
        System.err.println(listNode);
    }
}
