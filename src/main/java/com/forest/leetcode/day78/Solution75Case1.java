package com.forest.leetcode.day78;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：75.颜色分类
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/sort-colors/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年07月05日 17:04
 */
public class Solution75Case1 {
    private static final int RED = 0;
    private static final int WHITE = 1;
    private static final int BULE = 2;


    public static void sortColors(int[] nums) {
        List<Integer> redList = new ArrayList<>();
        List<Integer> whiteList = new ArrayList<>();
        List<Integer> buleList = new ArrayList<>();
        for (int num : nums) {
            if (RED == num) {
                redList.add(num);
            } else if (WHITE == num) {
                whiteList.add(num);
            } else if (BULE == num) {
                buleList.add(num);
            }
        }
        for (int i = 0; i < redList.size(); i++) {
            nums[i] = redList.get(i);
        }
        for (int i = 0; i < whiteList.size(); i++) {
            nums[redList.size() + i] = whiteList.get(i);
        }
        for (int i = 0; i < buleList.size(); i++) {
            nums[redList.size() + whiteList.size() + i] = buleList.get(i);
        }
    }
}
