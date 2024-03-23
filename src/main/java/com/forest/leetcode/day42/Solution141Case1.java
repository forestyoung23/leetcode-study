package com.forest.leetcode.day42;

import com.forest.leetcode.day7.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：141.环形链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月23日 11:53
 */
public class Solution141Case1 {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            if (list.contains(temp.next)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
