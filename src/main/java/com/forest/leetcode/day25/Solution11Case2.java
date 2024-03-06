package com.forest.leetcode.day25;

/**
 * 力扣题目序号：11.盛最多水的容器
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月06日 16:54
 */
public class Solution11Case2 {
    /**
     * 双指针
     *
     * @param height
     * @return int
     * @author Forest Dong
     * @date 2024/03/06 17:13
     */
    private static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = (height.length - 1) * Math.min(height[i], height[j]);
        for (int k = 0; k < height.length; k++) {
            if (i == j) {
                break;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            if ((j - i) * Math.min(height[i], height[j]) > max) {
                max = (j - i) * Math.min(height[i], height[j]);
            }
        }
        return max;
    }

    private static int maxArea1(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            max = height[i] < height[j] ?
                    Math.max((j - i) * Math.min(height[i++], height[j]), max) :
                    Math.max((j - i) * Math.min(height[i], height[j--]), max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.err.println(maxArea1(height));
    }
}
