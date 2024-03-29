package com.forest.leetcode.day43;

import com.forest.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：142.环形链表 II
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/linked-list-cycle-ii/submissions/515922232/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月24日 13:30
 */
public class Solution142Case1 {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            if (list.contains(temp.next)) {
                return temp.next;
            }
            temp = temp.next;
        }
        return null;
    }
}
