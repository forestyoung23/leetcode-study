package com.forest.leetcode.day77;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：46.全排列
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/permutations/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年07月04日 10:43
 */
public class Solution46Case1 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, new boolean[nums.length], res);
        return res;
    }

   static void backtrack(List<Integer> state, int[] choices, boolean[] selected, List<List<Integer>> res) {
        // 当状态长度等于元素数量时，记录解
        if (state.size() == choices.length) {
            res.add(new ArrayList<>(state));
            return;
        }
        // 遍历所有选择
        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];
            // 剪枝：不允许重复选择元素
            if (!selected[i]) {
                // 尝试：做出选择，更新状态
                selected[i] = true;
                state.add(choice);
                // 进行下一轮选择
                backtrack(state, choices, selected, res);
                // 回退：撤销选择，恢复到之前的状态
                selected[i] = false;
                state.remove(state.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);
    }
}
