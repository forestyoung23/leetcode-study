package com.forest.leetcode.day33;

import java.util.HashMap;
import java.util.Map;

/**
 * 力扣题目序号：560.和为 K 的子数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/subarray-sum-equals-k/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月13日 20:28
 */
public class Solution560Case2 {
    /**
     * 前缀和 + 哈希表优化
     *
     * @param nums
     * @param k
     * @return int
     * @author Forest Dong
     * @date 2024/03/13 20:29
     */
    private static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum -k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.err.println(subarraySum(nums, 2));
    }
}
