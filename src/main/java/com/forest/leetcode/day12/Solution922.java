package com.forest.leetcode.day12;

/**
 * 力扣题目序号：922.按奇偶排序数组 II
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月30日 17:49
 */
public class Solution922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0, j = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[i] = num;
                i += 2;
            } else {
                result[j] = num;
                j += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {4,2,5,7};
        int[] array = sortArrayByParityII(num);
        for (int i : array) {
            System.err.println(i);
        }
    }
}
