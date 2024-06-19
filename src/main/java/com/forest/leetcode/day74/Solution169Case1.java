package com.forest.leetcode.day74;

import java.util.HashMap;
import java.util.Map;

/**
 * 力扣题目序号：169.多数元素
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/majority-element/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年06月19日 19:35
 */
public class Solution169Case1 {
    private static final Map<Integer, Integer> map = new HashMap<>();

    public static int majorityElement(int[] nums) {
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int max = nums.length / 2 + 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.err.println(majorityElement(nums));
    }
}
