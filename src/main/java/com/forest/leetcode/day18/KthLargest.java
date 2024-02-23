package com.forest.leetcode.day18;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Forest Dong
 * @date 2024年02月19日 17:54
 */
public class KthLargest {

    private Queue<Integer> queue = new PriorityQueue();

    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            if (queue.size() < k) {
                queue.offer(num);
            } else {
                if (queue.peek() < num) {
                    queue.poll();
                    queue.offer(num);
                }
            }
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
            return queue.peek();
        } else {
            if (queue.peek() < val) {
                queue.poll();
                queue.offer(val);
                return queue.peek();
            } else {
                return queue.peek();
            }
        }
    }
}
