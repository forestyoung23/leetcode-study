package com.forest.leetcode.day42;

import com.forest.leetcode.day7.ListNode;

import java.util.HashMap;

/**
 * @author Forest Dong
 * @date 2024年03月23日 12:09
 */
public class Solution141Case2 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            map.put(temp, 0);
            if (map.containsKey(temp.next)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
