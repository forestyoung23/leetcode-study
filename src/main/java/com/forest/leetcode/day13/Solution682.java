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
    public static int calPoints(String[] operations) {
        List<Integer> numList = new ArrayList<>();
        for (String operation : operations) {
            switch (operation) {
                case "C":
                    numList.remove(numList.size() - 1);
                    break;
                case "D":
                    numList.add()
            }
        }
    }


    private static int findNum(int index, int pre, String[] operations) {
        for (int i = index - 1; i >= 0 ; i--) {
            if (!"C".equals(operations[i]) && !"D".equals(operations[i]) && !"+".equals(operations[i])) {
                return Integer.parseInt(operations[i - pre]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] str = {"5","2","C","D","+"};
        System.err.println(calPoints(str));
    }
}
