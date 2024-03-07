package com.forest.leetcode.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 力扣题目序号：15.三数之和
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/3sum/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月07日 18:51
 */
public class Solution15Case1 {
    /**
     * 暴力破解
     * 超出时间限制
     *
     * @param nums
     * @return {@link List }<{@link List }<{@link Integer }>>
     * @author Forest Dong
     * @date 2024/03/07 19:05
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> num = List.of(nums[i], nums[j], nums[k]);
                        if (!result.contains(num)) {
                            result.add(num);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> threeSum = threeSum(nums);
        System.err.println(threeSum);
    }
}
