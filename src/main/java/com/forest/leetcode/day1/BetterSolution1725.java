package com.forest.leetcode.day1;

/**
 * 力扣题目序号：1725
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月17日 19:55
 */
public class BetterSolution1725 {
    public static int countGoodRectangles(int[][] rectangles) {
        int ans = 0, maxLen = 0;
        for (int[] rectangle : rectangles) {
            int cur = Math.min(rectangle[0], rectangle[1]);
            if (cur == maxLen) {
                ans++;
            }
            if (cur > maxLen) {
                maxLen = cur;
                ans = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.err.println(countGoodRectangles(rectangles));
    }
}
