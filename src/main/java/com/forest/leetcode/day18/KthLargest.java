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


    /**
     * 思路：使用优先队列实现（小顶堆）实现
     * 1.若队列元素数量小于k,则将元素如列。
     * 2.若队列元素数量大于等于k,比较队首元素和待入队元素大小
     * 2.1若队首元素小，则出队，将新元素入队
     * 2.2若队首元素大，则不处理，保持不变
     *
     * @param val
     * @return int
     * @author Forest Dong
     * @date 2024/02/23 11:14
     */
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
