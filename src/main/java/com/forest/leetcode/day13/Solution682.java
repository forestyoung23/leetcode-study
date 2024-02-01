package com.forest.leetcode.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：682.棒球比赛
 * 难度：简单
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/baseball-game/description/
 * @date 2024年01月31日 17:31
 */
public class Solution682 {
    /**
     * 使用list模拟栈
     *
     * @param operations
     * @return int
     * @author Forest Dong
     * @date 2024/02/01 19:09
     */
    public static int calPoints(String[] operations) {
        List<Integer> points = new ArrayList<>();
        int sum = 0;
        for (String operation : operations) {
            switch (operation) {
                case "C":
                    sum -= points.get(points.size() - 1);
                    points.remove(points.size() - 1);
                    break;
                case "D":
                    sum += points.get(points.size() - 1) * 2;
                    points.add(points.get(points.size() - 1) * 2);
                    break;
                case "+":
                    sum += points.get(points.size() - 1) + points.get(points.size() - 2);
                    points.add(points.get(points.size() - 1) + points.get(points.size() - 2));
                    break;
                default:
                    sum += Integer.parseInt(operation);
                    points.add(Integer.parseInt(operation));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] str = {"5","2","C","D","+"};
        System.err.println(calPoints(str));
    }
}
