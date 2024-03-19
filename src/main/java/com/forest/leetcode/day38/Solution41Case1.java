package com.forest.leetcode.day38;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：41.缺失的第一个正数
 * 难度：困难
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/first-missing-positive/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月19日 19:41
 */
public class Solution41Case1 {
    /**
     * 超出时间限制
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/03/19 19:49
     */
    private static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        List<Integer> list = new ArrayList<>(length);
        for (int num : nums) {
            if (num < 0) {
                continue;
            }
            list.add(num);
        }
        for (int i = 1; i <= length + 1; i++) {
            if (!list.contains(i)) {
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
