package com.dbs.top.easy.array;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class Question1 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(nums));
        new Question1().removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
