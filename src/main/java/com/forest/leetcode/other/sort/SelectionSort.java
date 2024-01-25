package com.forest.leetcode.other.sort;

/**
 * 选择排序
 *
 * @author Forest Dong
 * @date 2024年01月25日 19:31
 */
public class SelectionSort {
    /**
     * 设数组的长度为n
     * 1.初始状态下，所有元素未排序，即未排序（索引）区间为[0, n-1]。
     * 2.选取区间[0, n-1]中的最小元素，将其与索引 0 处的元素交换。完成后，数组前 1 个元素已排序。
     * 3.选取区间[1, n-1]中的最小元素，将其与索引 1 处的元素交换。完成后，数组前 2 个元素已排序。
     * 4.以此类推。经过 n-1 轮选择与交换后，数组前 n-1 个元素已排序。
     * 5.仅剩的一个元素必定是最大元素，无须排序，因此数组排序完成。
     *
     * @param nums
     * @author Forest Dong
     * @date 2024/01/25 19:38
     */
    private static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 2, 0, 3, 8};
        sort(nums);
        for (int num : nums) {
            System.err.println(num);
        }
    }
}
