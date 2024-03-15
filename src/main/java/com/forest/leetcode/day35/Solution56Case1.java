package com.forest.leetcode.day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 力扣题目序号：56.合并区间
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月15日 18:56
 */
public class Solution56Case1 {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] == o2[0]){
                return 0;
            } else {
                return -1;
            }
        });
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            if (last[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } else {
                if (last[1] < intervals[i][1]) {
                    last[1] = intervals[i][1];
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {18, 20}, {15, 18}};
        int[][] merge = merge(intervals);
        System.err.println(merge);
    }
}
