package com.forest.leetcode.day23;

import java.util.*;

/**
 * 力扣题目序号：128.最长连续序列
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月05日 19:15
 */
public class Solution128Case1 {
    public static int longestConsecutive(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num - 1)) {
                map.put(num, map.get(num - 1) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
//        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.err.println(longestConsecutive(nums));
    }
}
