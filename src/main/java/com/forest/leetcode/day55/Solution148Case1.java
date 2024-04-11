package com.forest.leetcode.day55;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：148.排序链表
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/sort-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月11日 19:17
 */
public class Solution148Case1 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }
}
