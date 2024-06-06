package com.forest.leetcode.day73;

import java.util.HashMap;
import java.util.Map;

/**
 * 力扣题目序号：136.只出现一次的数字
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年06月06日 09:37
 */
public class Solution136Case1 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else{
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (1 == entry.getValue()) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.err.println(singleNumber(nums));
    }
}
