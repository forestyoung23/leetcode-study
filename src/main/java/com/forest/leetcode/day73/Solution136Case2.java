package com.forest.leetcode.day73;

import java.util.HashSet;

/**
 * 力扣题目序号：136.只出现一次的数字
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年06月06日 10:36
 */
public class Solution136Case2 {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return (Integer) set.toArray()[0];
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.err.println(singleNumber(nums));
    }
}
