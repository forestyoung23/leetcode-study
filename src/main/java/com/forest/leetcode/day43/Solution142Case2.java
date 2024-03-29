package com.forest.leetcode.day43;

import com.forest.leetcode.common.ListNode;

import java.util.*;

/**
 * 力扣题目序号：142.环形链表 II
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/linked-list-cycle-ii/submissions/515922232/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月24日 13:33
 */
public class Solution142Case2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
