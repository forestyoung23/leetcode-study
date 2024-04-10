package com.forest.leetcode.day54;

import java.util.HashMap;
import java.util.Map;

/**
 * 力扣题目序号：138.随机链表的复制
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月10日 19:03
 */
public class Solution138Case1 {

    private static Map<Node, Node> cacheNode = new HashMap<>();
    public static Node copyRandomList(Node head) {
        if (null == head) {
            return null;
        }
        if (!cacheNode.containsKey(head)) {
            Node newNode = new Node(head.val);
            cacheNode.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return cacheNode.get(head);
    }
}
