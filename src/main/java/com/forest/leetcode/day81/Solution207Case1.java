package com.forest.leetcode.day81;

import java.util.ArrayList;
import java.util.List;

/**
 * 力扣题目序号：207.课程表
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/course-schedule/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年08月12日 18:46
 */
public class Solution207Case1 {
    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; ++i) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    public void dfs(int u) {
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }
}
