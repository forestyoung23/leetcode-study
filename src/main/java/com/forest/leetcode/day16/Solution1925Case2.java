package com.forest.leetcode.day16;

/**
 * 力扣题目序号：1925.统计平方和三元组的数目
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/count-square-sum-triples/description/
 * @date 2024年02月18日 17:20
 */
public class Solution1925Case2 {
    /**
     * @param n
     * @return int
     * @author Forest Dong
     * @date 2024/02/18 17:27
     */
    private static int countTriples(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int sum = i * i + j * j;
                if (sum <= n * n) {
                    for (int k = 1; k <= n; k++) {
                        if (k * k == sum) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.err.println(countTriples(10));
    }
}
