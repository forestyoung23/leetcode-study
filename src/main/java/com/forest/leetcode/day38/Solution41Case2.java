package com.forest.leetcode.day38;

import java.util.*;

/**
 * 力扣题目序号：41.缺失的第一个正数
 * 难度：困难
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/first-missing-positive/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月19日 19:52
 */
public class Solution41Case2 {
    /**
     * 1.将数组添加到 hash 表中（只需要大于0的部分）
     * 2.从 1 开始遍历，如 hash 表中不包含对应的 key 则返回
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/03/19 20:30
     */
    private static int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num > 0) {
                map.put(num, 1);
            }
        }
        for (int i = 1; i <= map.size() + 1; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 11, 12};
        System.err.println(firstMissingPositive(nums));
    }
}
