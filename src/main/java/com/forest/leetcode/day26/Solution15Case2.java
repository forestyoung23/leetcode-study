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
 * @date 2024年03月07日 19:19
 */
public class Solution15Case2 {
    /**
     * 双指针
     *
     * @param nums
     * @return {@link List }<{@link List }<{@link Integer }>>
     * @author Forest Dong
     * @date 2024/03/07 19:05
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = length - 1;
            int target = -nums[i];
            for (int j = i + 1; j < length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (j < k && nums[j] + nums[k] > target) {
                    k--;
                }
                if (j == k) {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
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
