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
 * @date 2024年03月07日 19:37
 */
public class Solution15Case3 {
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
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
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
