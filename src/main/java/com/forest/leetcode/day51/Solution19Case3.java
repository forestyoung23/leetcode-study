package com.forest.leetcode.day51;

import com.forest.leetcode.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 力扣题目序号：19.删除链表的倒数第 N 个结点
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月02日 19:51
 */
public class Solution19Case3 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode curr = dummy;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode peek = stack.peek();
        peek.next = peek.next.next;
        return dummy.next;
    }
}
