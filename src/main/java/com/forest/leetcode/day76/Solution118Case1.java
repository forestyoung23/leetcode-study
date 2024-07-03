package com.forest.leetcode.day76;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：118.杨辉三角
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/pascals-triangle/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年07月03日 17:17
 */
public class Solution118Case1 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println(generate(5));
    }
}
