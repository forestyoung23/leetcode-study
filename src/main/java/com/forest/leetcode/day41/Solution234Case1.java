package com.forest.leetcode.day41;

import com.forest.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：234.回文链表
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/palindrome-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月21日 20:02
 */
public class Solution234Case1 {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (null != head) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.err.println(isPalindrome(node1));
    }
}
