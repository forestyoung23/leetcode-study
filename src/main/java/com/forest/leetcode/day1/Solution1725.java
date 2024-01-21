package com.forest.leetcode.day1;

/**
 * 力扣题目序号：1725
 * 难度：简单
 *
 * @author Forest Dong
 * @date 2024年01月17日 19:49
 */
public class Solution1725 {

    /**
     * 思路
     * 1.定义一个一维数组a，找出二维数组rectangles中每个一维数组中的最小值，将其放到a中。
     * 2.使用冒泡排序数组a。
     * 3.统计排序好后的数组a中最大值有几个
     *
     * @param rectangles
     * @return int
     * @author Forest Dong
     * @date 2024/01/17 19:53
     */
    public static int countGoodRectangles(int[][] rectangles) {
        int[] a = new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            a[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        sort(a);
        int max = a[0];
        int result = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == max) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    /**
     * 排序
     *
     * @param arr
     * @author Forest Dong
     * @date 2024/01/21 16:41
     */
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.err.println(countGoodRectangles(rectangles));
    }
}
