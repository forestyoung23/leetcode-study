package com.forest.leetcode.day19;

/**
 * 力扣题目序号：1822.数组元素积的符号
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/sign-of-the-product-of-an-array/description/
 * @date 2024年02月22日 16:51
 */
public class Solution1822 {
    /**
     * 思路：
     * 需要返回元素积的符号，因此可以不用计算元素积，只需要判断数组中负数的个数
     * 1.若数组中包含 0，则直接返回 0；
     * 2.若负数个数为奇数，则返回 -1；
     * 3.若负数个数为偶数，则返回 1；
     *
     * @param nums
     * @return int
     * @author Forest Dong
     * @date 2024/02/22 16:59
     */
    public static int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int num : nums) {
            if (0 == num) {
                return 0;
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        return negativeCount % 2 == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 4};
        System.err.println(arraySign(nums));
    }
}
