package com.forest.leetcode.day18;

/**
 * 力扣题目序号：703.数据流中的第 K 大元素
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/kth-largest-element-in-a-stream/description/
 * @date 2024年02月19日 17:53
 */
public class Solution703 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest largest = new KthLargest(3, nums);
        System.err.println(largest.add(3));
        System.err.println(largest.add(5));
        System.err.println(largest.add(10));
        System.err.println(largest.add(9));
        System.err.println(largest.add(4));
    }
}
