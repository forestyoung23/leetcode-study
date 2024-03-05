package com.forest.leetcode.day23;

import java.util.HashSet;
import java.util.Set;

/**
 * 力扣题目序号：128.最长连续序列
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月05日 19:32
 */
public class Solution128Case2 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (int num : set) {
            int curNum = num;
            if (!set.contains(curNum - 1)) {
                while (set.contains(curNum + 1)) {
                    curNum++;
                }
            }
            ans = Math.max(ans, curNum - num);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.err.println(longestConsecutive(nums));
    }
}
