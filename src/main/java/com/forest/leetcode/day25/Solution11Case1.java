package com.forest.leetcode.day25;

/**
 * 力扣题目序号：11.盛最多水的容器
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月06日 16:54
 */
public class Solution11Case1 {
    /**
     * 此方法超出时间限制
     *
     * @param height
     * @return int
     * @author Forest Dong
     * @date 2024/03/06 17:06
     */
    private static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = (j - i) * Math.min(height[i], height[j]);
                if (water > max ) {
                    max = water;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.err.println(maxArea(height));
    }
}
