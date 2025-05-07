package com.forest.leetcode.day81;

import java.util.*;

/**
 * 力扣题目序号：207.课程表
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/course-schedule/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2025年05月07日 18:54
 */
public class Solution207Case1 {

    public static void main(String[] args) {
        int[][] prerequisites = {{3, 0}, {3, 1}, {4, 1}, {4, 2}, {5, 3}, {5, 4}};
        System.err.println(canFinish(6, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
       int[] indegree = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            indegree[prerequisite[0]]++;
            adjacency.get(prerequisite[1]).add(prerequisite[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer pre = queue.poll();
            numCourses--;
            for (Integer cur : adjacency.get(pre)) {
                if (--indegree[cur] == 0) {
                    queue.add(cur);
                }
            }
        }
        return numCourses == 0;
    }
}
