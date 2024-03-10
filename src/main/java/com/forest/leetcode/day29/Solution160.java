package com.forest.leetcode.day29;

import com.forest.leetcode.day7.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 力扣题目序号：160.相交链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/intersection-of-two-linked-lists/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月10日 11:42
 */
public class Solution160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
