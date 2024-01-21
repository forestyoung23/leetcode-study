package com.forest.leetcode.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：面试题 17.04.消失的数字
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/missing-number-lcci/description/
 * @date 2024年01月21日 16:08
 */
public class Solution1704Case1 {
    public static int missingNumber(int[] nums) {
        List<Integer> list1 = new ArrayList<>(nums.length);
        for (int num : nums) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            list2.add(i);
        }
        for (Integer i : list2) {
            if (!list1.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.err.println(missingNumber(nums));
    }
}
