package com.forest.leetcode.day42;

import com.forest.leetcode.day7.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Forest Dong
 * @date 2024年03月23日 12:10
 */
public class Solution141Case3 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
