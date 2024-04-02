package com.forest.leetcode.day51;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：19.删除链表的倒数第 N 个结点
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月02日 19:50
 */
public class Solution19Case2 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
