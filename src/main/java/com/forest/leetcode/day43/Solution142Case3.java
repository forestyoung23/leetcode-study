package com.forest.leetcode.day43;

import com.forest.leetcode.day7.ListNode;

/**
 * 力扣题目序号：142.环形链表 II
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/linked-list-cycle-ii/submissions/515922232/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月24日 13:36
 */
public class Solution142Case3 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
