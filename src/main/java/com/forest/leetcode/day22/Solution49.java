package com.forest.leetcode.day22;

import java.util.*;

/**
 * 力扣题目序号：49.字母异位词分组
 * 难度：中等
 *
 * @author Forest Dong
 * @link https://leetcode.cn/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-100-liked
 * @date 2024年03月04日 20:35
 */
public class Solution49 {
    /**
     * 思路
     * 异位词：既两个字符串包含的字母相同
     * 初始化一个 map，key 为排序后的异位词，value 为词组
     * 1.将字符串排序
     * 2.若 map 中已存在该字符串，将该字符串的原始字符串添加到词组中
     * 3.若 map 中不存在该字符串，将该字符串的原始字符串添加到词组中
     * 4.返回 map 的 value 集合
     *
     * @param strs
     * @return {@link List }<{@link List }<{@link String }>>
     * @author Forest Dong
     * @date 2024/03/04 20:57
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> list;
            if (map.containsKey(s)) {
                list = map.get(s);
            } else {
                list = new ArrayList<>();
                map.put(s, list);
            }
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        for (List<String> strings : list) {
            for (String string : strings) {
                System.err.println(string);
            }
        }
    }
}
