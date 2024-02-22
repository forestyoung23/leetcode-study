package com.forest.leetcode.day19;

/**
 * @author Forest Dong
 * @date 2024年02月22日 17:08
 */
public class Solution1822Case2 {

    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (0 == num) {
                return 0;
            }
            if (num < 0) {
                sign = -sign;
            }
        }
        return sign;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 4};
        System.err.println(arraySign(nums));
    }
}
