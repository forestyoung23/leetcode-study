package com.forest.leetcode.day42;

import com.forest.leetcode.common.ListNode;

/**
 * @author Forest Dong
 * @date 2024年03月23日 12:12
 */
public class Solution141Case4 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = head.next.next;
        }
        return true;
    }
}
