package com.forest.leetcode.other.sort;

/**
 * 冒泡排序
 *
 * @author Forest Dong
 * @date 2024年01月25日 20:00
 */
public class BubbleSort {
    /**
     * 设数组的长度为 n
     * 1.首先，对 n 个元素执行“冒泡”，将数组的最大元素交换至正确位置。
     * 2.接下来，对剩余 n-1 个元素执行“冒泡”，将第二大元素交换至正确位置。
     * 3.以此类推，经过 n-1 轮“冒泡”后，前 n-1 大的元素都被交换至正确位置。
     * 4.仅剩的一个元素必定是最小元素，无须排序，因此数组排序完成。
     *
     * @param nums
     * @author Forest Dong
     * @date 2024/01/25 20:10
     */
    private static void sort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序（标志优化）
     *
     * @param nums
     * @author Forest Dong
     * @date 2024/01/25 20:14
     */
    private static void sortWithFlag(int[] nums) {
        // 外循环：未排序区间为 [0, i]
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false; // 初始化标志位
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // 交换 nums[j] 与 nums[j + 1]
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true; // 记录交换元素
                }
            }
            if (!flag)
                break; // 此轮“冒泡”未交换任何元素，直接跳出
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
