package com.forest.leetcode.day36;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 力扣题目序号：189.轮转数组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月17日 17:35
 */
public class Solution189Case2 {
    /**
     * 该方案适用于：k < nums.length
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int count = k % nums.length;
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(nums[length -count + i]);
        }
        for (int i = 0; i < length - count; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.err.println(1);
    }
}
