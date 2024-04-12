package com.forest.leetcode.day56;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 力扣题目序号：146.LRU缓存
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/lru-cache/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年04月12日 17:19
 */
public class LRUCache1 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache1(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
