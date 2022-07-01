package com.leetcode.array;


import java.util.Arrays;

/**
 * 215. 数组中的第K个最大元素
 *
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 *
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *
 *
 *
 * 提示：
 *
 *     1 <= k <= nums.length <= 104
 *     -104 <= nums[i] <= 104
 *
 *
 *
 *
 */
public class LeetCode215 {

    public int findKthLargest(int[] nums, int k) {
        if (nums==null || k<=0) {
            return 0;
        }
        //数组排序
        Arrays.sort(nums);
        return nums[nums.length- k];

    }

}
