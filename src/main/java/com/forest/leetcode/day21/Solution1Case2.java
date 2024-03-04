package com.forest.leetcode.day21;

import java.util.HashMap;

/**
 * 力扣题目序号：1.两数之和
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月04日 20:01
 */
public class Solution1Case2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        for (int anInt : ints) {
            System.err.println(anInt);
        }
    }
}
