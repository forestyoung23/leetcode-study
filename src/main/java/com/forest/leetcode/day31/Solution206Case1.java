package com.forest.leetcode.day31;

import com.forest.leetcode.day7.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：206.反转链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月11日 19:50
 */
public class Solution206Case1 {
    public static ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        List<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            ListNode listNode = new ListNode(temp.val);
            nodes.add(listNode);
            temp = temp.next;
        }
        for (int i = nodes.size() - 1; i > 0; i--) {
            nodes.get(i).next = nodes.get(i - 1);
        }
        return nodes.get(nodes.size() - 1);
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
