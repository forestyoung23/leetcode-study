package com.forest.leetcode.day49;

import com.forest.leetcode.common.ListNode;

/**
 * 力扣题目序号：21.合并两个有序链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月31日 14:28
 */
public class Solution21Case2 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
