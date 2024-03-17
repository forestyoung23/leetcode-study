package com.forest.leetcode.day36;

import java.util.LinkedList;
import java.util.List;

/**
 * 力扣题目序号：189.轮转数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月17日 17:35
 */
public class Solution189Case2 {
    /**
     * 该方案适用于：k < nums.length
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int count = nums.length % k;
        List<Integer> list = new LinkedList<>();
    }

}
